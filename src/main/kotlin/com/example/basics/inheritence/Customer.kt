package com.example.basics.inheritence


class Customer(val name :String) {
    fun eats(food : BakeryGoods) : String  = "$name is eating ${food.eat()}"
}

fun main(args: Array<String>) {
    val customer = Customer("Pradnya")
    print(customer.eats(Donut("Chocolate","chocochips")))

}