package org.example

fun main() {

    var cities = arrayOf<String>("Madrid", "Sydney", "London")

    println(cities[1])
    println(cities[2])

    cities[2] = "Lisbon"
    println(cities[2])
    println("======")

    var haveCities = cities.isEmpty()

    println(haveCities)

    var values = arrayOf<Int>()

    println(values.isEmpty())
    println(cities.size)

    var fruits = ArrayList<String>()

    println("\nFruits = " + fruits.size)
    fruits.add("Apple")
    fruits.add("Pineapple")
    fruits.add("Orange")
    fruits.add("Strawberry")

    println(fruits.size)

    println(fruits.contains("Apple"))

    //see all list items

    println(fruits)
    fruits.remove("Orange")
    println(fruits)

}