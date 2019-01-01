package com.example.basics

import org.junit.Assert
import org.junit.Test

class HelloWorldTest{

    @Test
    fun `should say hello`(){
        val str = HelloWorld().sayHello("Pradnya")
        Assert.assertEquals("Hello Pradnya",str)
    }
}