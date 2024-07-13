package haak.haak

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HaakApplication

fun main(args: Array<String>) {
	runApplication<HaakApplication>(*args)
}
