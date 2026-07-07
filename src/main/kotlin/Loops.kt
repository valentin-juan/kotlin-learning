package org.example

fun main() {

    var number = listOf(1, 2, 3, 4, 5, 6, 15, 18, 45, 57)
//    var i  = 0

    /*for (i in number) {
        if (i % 2 == 0)
            println("Number is ${i} is even")
        else println("Number is $i is odd")
    }*/

    for (i in 0 until number.size) {
        if (number[i] % 2 == 0) {
            println("Number: $i is even")
        }
    }

    /*while (i < number.size) {
        if (number[i] % 2 == 0) {
            println("Number ${number[i]} is even")
        } else println("Number ${number[i]} is odd")
        i += 1
    }*/
}