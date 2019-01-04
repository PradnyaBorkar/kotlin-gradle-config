package com.example.basics

class HelloWorld{
    fun sayHello(name: String): String {
        return "Hello $name"
    }
}

fun main(args: Array<String>) {
    print("${HelloWorld().sayHello("Pradnya")}")
}