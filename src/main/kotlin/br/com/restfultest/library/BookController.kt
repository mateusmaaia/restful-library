package br.com.restfultest.library

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class BookController {

    private val counter = AtomicLong()

    @GetMapping("/books")
    fun getBooks(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Book(counter.incrementAndGet(), "Hello, $name", "Teste", 123, "PT-BR")
}