package com.privatelibrarian.app.data.local

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DocumentDaoTest {

    private lateinit var database: AppDatabase
    private lateinit var dao: DocumentDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java
        ).allowMainThreadQueries().build()
        dao = database.documentDao()
    }

    @After
    fun teardown() {
        database.close()
    }

    @Test
    fun insertAndGetDocument() = runBlocking {
        val document = DocumentEntity(
            id = "1",
            title = "Test Doc",
            filePath = "/path/to/doc",
            type = "PDF",
            size = 100,
            lastModified = System.currentTimeMillis(),
            indexingState = "COMPLETED",
            tags = "test,doc"
        )
        dao.insertDocument(document)
        
        val allDocs = dao.getAllDocuments().first()
        assertEquals(1, allDocs.size)
        assertEquals("Test Doc", allDocs[0].title)
    }
}
