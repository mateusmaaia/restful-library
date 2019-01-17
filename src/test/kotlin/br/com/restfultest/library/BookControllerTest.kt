package br.com.restfultest.library

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import org.junit.Assert.*
import org.springframework.beans.factory.annotation.Autowired

@RunWith(SpringRunner::class)
@SpringBootTest
class BookControllerTest {
    @Autowired
    lateinit var bookController : BookController

    @Test
    fun getBooks() {
        val firstTest = bookController.getBooks("Teste")
        assertNotNull(firstTest)
    }
}