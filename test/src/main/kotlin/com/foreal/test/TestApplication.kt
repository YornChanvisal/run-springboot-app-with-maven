package com.foreal.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class TestApplication

//fun main(args: Array<String>) {
//	runApplication<TestApplication>(*args)
//}

fun main(args: Array<String>) {
	SpringApplication.run(TestApplication::class.java, *args)
}
