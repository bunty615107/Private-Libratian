package com.privatelibrarian.app.data.local

import android.content.Context
import android.util.Log

/**
 * ObjectBox store manager.
 * Currently stubbed — will use BoxStore when the ObjectBox plugin is re-enabled.
 */
object ObjectBoxManager {
    private var isInitialized = false

    fun init(context: Context) {
        // TODO: When ObjectBox plugin is re-enabled, initialize MyObjectBox here
        // boxStore = MyObjectBox.builder()
        //     .androidContext(context.applicationContext)
        //     .build()
        Log.d("ObjectBoxManager", "Stub: ObjectBox initialization skipped")
        isInitialized = true
    }
}
