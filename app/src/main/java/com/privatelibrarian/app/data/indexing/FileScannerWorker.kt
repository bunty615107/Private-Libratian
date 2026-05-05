package com.privatelibrarian.app.data.indexing

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.privatelibrarian.app.data.local.AppDatabase
import com.privatelibrarian.app.data.local.DocumentEntity
import java.io.File
import java.util.UUID

class FileScannerWorker(
    context: Context,
    params: WorkerParameters,
    private val database: AppDatabase
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result {
        val rootPath = inputData.getString("root_path") ?: return Result.failure()
        val root = File(rootPath)

        if (root.exists() && root.isDirectory) {
            root.walk().forEach { file ->
                if (file.extension == "pdf") {
                    val entity = DocumentEntity(
                        id = UUID.randomUUID().toString(),
                        title = file.name,
                        filePath = file.absolutePath,
                        type = "PDF",
                        size = file.length(),
                        lastModified = file.lastModified(),
                        indexingState = "PENDING",
                        tags = ""
                    )
                    database.documentDao().insertDocument(entity)
                }
            }
            return Result.success()
        }
        return Result.failure()
    }
}
