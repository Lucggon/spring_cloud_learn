package com.bank.agregattor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class AgregattorApplication

fun main(args: Array<String>) {
	runApplication<AgregattorApplication>(*args)
}
