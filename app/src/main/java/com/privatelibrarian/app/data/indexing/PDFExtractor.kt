package com.privatelibrarian.app.data.indexing

import android.util.Log
import java.io.File

interface TextExtractor {
    fun extractText(file: File): String
}

/**
 * PDF text extractor.
 * Currently stubbed — will use PdfBox-Android when added as a dependency.
 */
class PDFExtractor : TextExtractor {
    override fun extractText(file: File): String {
        return try {
            // TODO: Add com.tom-roush:pdfbox-android dependency and use PDDocument/PDFTextStripper
            Log.d("PDFExtractor", "Stub: would extract text from ${file.name}")
            "PDF text extraction requires PdfBox-Android dependency. File: ${file.name}"
        } catch (e: Exception) {
            ""
        }
    }
}
