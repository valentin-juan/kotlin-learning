package org.example

fun main() {

    //var using to read-only(immutable
    //val using to mutable

    println("==== val variables")
    val name = "Juan";
    println("Hello, $name!")
    println(name)

    println("Number of characters is ${name.length}")
    println()

    println("==== var variable and using typing variables")
    //setting String variable
    var city: String = "Curitiba"
    println("Nome cities are ${city}")
    println("Number of characters is ${city.length}")
    println()

    println("==== char variable")
    //to using char, just use ' '
    var type = 'X'
    type = 'O'
    println("Type is $type")
    println()

    println("==== using Pair variables")
    var (code, description) = Pair(100, "Mouse")
    println(code)
    println(description)
    println()

    var product: Pair<Int, String> = Pair (200, "Keyboard")
    println(product)
    println(product.first)
    println(product.second)

}