package pt.boot.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringBootWithKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootWithKotlinApplication::class.java, *args)
}
