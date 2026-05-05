package com.privatelibrarian.app.data.indexing

import android.content.Context
import androidx.work.*
import java.util.concurrent.TimeUnit

object WorkManagerHelper {
    fun scheduleIndexing(context: Context) {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.NOT_REQUIRED)
            .setRequiresCharging(true) // Optimize for battery
            .setRequiresDeviceIdle(true) // Run when user isn't active
            .setRequiresStorageNotLow(true)
            .build()

        val indexingRequest = PeriodicWorkRequestBuilder<FileScannerWorker>(1, TimeUnit.DAYS)
            .setConstraints(constraints)
            .setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 1, TimeUnit.HOURS)
            .build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            "document_indexing",
            ExistingPeriodicWorkPolicy.KEEP,
            indexingRequest
        )
    }
}
