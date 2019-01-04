package com.example.basics

class ControlFlow {

    companion object {
        fun finMax(a :Int, b :Int) : Int = if(a < b ) b else a
    }

    fun checkMonthUsingCase(month: Month){
        when(month){
            Month.JANUARY -> print("Its January")
            Month.FEBRUARY -> print("Its February")
        }
    }

    fun useLoop(){

    }
}

fun main(str : Array<String>) {
    val obj = ControlFlow()

    //use of if to find max of 2 numbers
    ControlFlow.finMax(1, 2)

    // use when to choose between cases
    obj.checkMonthUsingCase(Month.FEBRUARY)
}
