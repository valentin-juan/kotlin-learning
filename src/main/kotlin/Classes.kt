package org.example

import org.example.classes.model.Person
import java.time.LocalDate

fun main() {
    val person = Person()
    person.name = "John"
    person.height = 1.70
    person.weight = 85.5
    person.birthday = LocalDate.of(2000, 1, 1)

    println(person.name)
    println("")
    person.getAll()

    println(person.calcAge())
}