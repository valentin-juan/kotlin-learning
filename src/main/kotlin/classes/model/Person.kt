package org.example.classes.model

import java.time.LocalDate
import java.time.Period

open class Person {

    var name: String = ""
    var birthday: LocalDate = LocalDate.of(2000, 5, 5)
    var weight: Double = 0.0
    var height: Double = 0.0
    val age: Int
        get() {
            return Period.between(birthday, LocalDate.now()).years
        }

    open fun getAll() {
        println("Name: $name")
        println("Birthday: $birthday")
        println("Weight: $weight")
        println("Height: $height")
        println("Age: $age")
        println("*****************")
    }

    fun calcAge(): Int {
        var age = Period.between(birthday, LocalDate.now()).years
        return age
    }
}