package com.privatelibrarian.app.data.indexing

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import java.io.File

class FileScannerWorker(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result {
        val rootPath = inputData.getString("root_path") ?: return Result.failure()
        val root = File(rootPath)

        if (root.exists() && root.isDirectory) {
            root.walk().forEach { file ->
                if (file.extension == "pdf") {
                    Log.d("FileScannerWorker", "Found PDF: ${file.absolutePath}")
                    // TODO: Insert into Room DB when wired up with DI
                }
            }
            return Result.success()
        }
        return Result.failure()
    }
}
