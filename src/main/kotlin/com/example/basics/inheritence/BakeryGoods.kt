package com.example.basics.inheritence



interface Bake{
    fun bakingMethod(good : String) :String
}

abstract class BakeryGoods(private val flavour:String){

    init {
        println("Preparing a new bakery good")
    }
    fun eat() :String{
        return "nom, nom, nom... delicious $flavour ${name()}"
    }

    abstract fun name() :String
}

class Cupcake(private val flavour : String ) :BakeryGoods(flavour),Bake{
    override fun name() :String = "Cup cake "
    override fun bakingMethod(good: String) : String {
        return "Baked $good"
    }

    companion object {

        fun cheeseCase(): Cupcake = Cupcake("Cheese")
    }
}

class Donut : BakeryGoods,Bake {
    private val flavour: String
    private val toppings: String

    constructor(flavour: String, toppings: String) : super(flavour) {
        this.flavour = flavour
        this.toppings = toppings
    }

    override fun name(): String = "${bakingMethod("Donut")} with $toppings"

    override fun bakingMethod(good: String) : String {
        return "Fried $good"
    }

}

fun main(str : Array<String>){
    val donut : BakeryGoods = Donut("Strawberry","chocochips")
    print(donut.eat())

    val cupcake = Cupcake("cheese")
    //cupcake.cheeseCase() cant access with instance variable
    //calling method defined in companion object
    Cupcake.cheeseCase()


}