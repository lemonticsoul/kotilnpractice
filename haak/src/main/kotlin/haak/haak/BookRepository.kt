package haak.haak

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
class BookConfig{
    @Bean
    fun bookService(bookRepository: BookRepository):BookService{
        return BookService
    }
}

@RestController
class BookController(private val bookService: BookService){
    @GetMapping("books")
    fun getAllBooks():String{
        return bookService.getAllBooks().join
    }
}

@Repository
class BookRepository {
    fun findAllBooks():List<String>{
        val context=ClassPathXmlApplicationContext("beans.xml")
        val bookservice:BookService =context.getBean("bookService",BookService:class.java)
        return listOf("코틀린");
    }
}

class BookService(private )