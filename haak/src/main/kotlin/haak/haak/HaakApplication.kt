package haak.haak

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication(scanBasePackages = ["haak.config"])
@RestController
class HaakApplication{

	@GetMapping("/books")
	fun getAllBooks(){
		val bookService:BookService
		return
	}
}

fun main(args: Array<String>) {
	val context=runApplication<HaakApplication>(*args)

}
