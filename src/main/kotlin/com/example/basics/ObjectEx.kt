package com.example.basics

interface Oven{
    fun type()
}

object ElectricOven : Oven {

    override fun type() {
        print("I am Electric Oven")
    }

}

fun main(args: Array<String>) {
    print("${ElectricOven.type()}")
}