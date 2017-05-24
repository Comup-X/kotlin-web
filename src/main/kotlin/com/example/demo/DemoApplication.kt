package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication{

    fun test(){
        println("123")
    }
}

fun test(){
    println("666")
}

fun main(args: Array<String>) {
    test()
    val application = DemoApplication()
    application.test()
    SpringApplication.run(DemoApplication::class.java, *args)
}