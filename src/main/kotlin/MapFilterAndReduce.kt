package org.example

fun main() {

    var numbers = listOf(1,2,3,4,5,6,7,8,9,10)

    var even = numbers.filter { it % 2 == 0 }
    var odd = numbers.filter { it % 2 != 0 }
    println("Even numbers = $even")
    println("Odd numbers = $odd")

    var fruits = listOf("Apple", "Banana", "Pear", "Grapes", "Strawberry")
    var fruitsM = fruits.filter { it.startsWith("A") }
    println("Fruit start with 'A' = $fruitsM")

    println("**** Using Map ****")

    var fruitsUpperCase = fruits.map {
        it.uppercase()
    }
    println(fruitsUpperCase)

    var fruitsLowerCase = fruits.map {
        it.lowercase()
    }
    println(fruitsLowerCase)

    println("**** Using Reduce ****")

    var reduceNumbers = listOf(1,2,3,4,5)
    var some = reduceNumbers.reduce { acc, i ->
        acc + i
    }
    println(some)

}