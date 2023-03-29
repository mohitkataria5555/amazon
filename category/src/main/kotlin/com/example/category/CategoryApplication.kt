package com.example.category

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CategoryApplication

fun main(args: Array<String>) {
	runApplication<CategoryApplication>(*args)
}
