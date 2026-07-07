package org.example.classes.model

class Employee: Person(){

    var position: String = ""
    var salary: Double = 0.0

    override fun getAll() {
        println("Name: $name")
        println("Birthday: $birthday")
        println("Weight: $weight")
        println("Height: $height")
        println("Age: $age")
        println("Salary: R$ $salary")
        println("Position: $position")
        println("*****************")
    }

}