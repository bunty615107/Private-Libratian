package com.privatelibrarian.app.data.indexing

import android.content.Context
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader
import com.tom_roush.pdfbox.pdmodel.PDDocument
import com.tom_roush.pdfbox.text.PDFTextStripper
import java.io.File

interface TextExtractor {
    fun extractText(file: File): String
}

class PDFExtractor(private val context: Context) : TextExtractor {
    init {
        PDFBoxResourceLoader.init(context)
    }

    override fun extractText(file: File): String {
        return try {
            val document = PDDocument.load(file)
            val stripper = PDFTextStripper()
            val text = stripper.getText(document)
            document.close()
            text
        } catch (e: Exception) {
            ""
        }
    }
}
