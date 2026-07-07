package org.example

import org.example.classes.model.Employee
import org.example.classes.model.Person

fun main() {

    var person = Person()
    person.name = "John Smith"
    person.weight = 90.5
    person.height = 1.80
    person.getAll()

    var employee = Employee()
    employee.name = "Joseph Smith"
    employee.weight = 100.0
    employee.height = 1.78
    employee.position = "Software developer"
    employee.salary = 10000.0
    employee.getAll()

}