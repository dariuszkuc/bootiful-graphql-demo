package com.example.bootiful

import graphql.execution.instrumentation.tracing.TracingInstrumentation
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BootifulApplication {

	@Bean
	fun tracing() = TracingInstrumentation()
}

fun main(args: Array<String>) {
	runApplication<BootifulApplication>(*args)
}
