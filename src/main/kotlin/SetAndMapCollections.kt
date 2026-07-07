package org.example

fun main() {
    var movie = HashSet<String>()

    println(movie.size)

    movie.add("Spider Man")
    movie.add("Lord of the Rings")
    movie.add("Super Mario World")
    println(movie.size)
    println(movie)

    movie.add("Spider Man")
    println(movie)

    movie.add("Spider Man 2")
    println(movie)

    println(movie.contains("Spider Man"))

    movie.remove("Spider Man 2")
    println(movie)

    var price = setOf(45.9, 78.6, 54.9)
    println(price)

    var products = HashMap<String, Double>()
    products.put("Mouse", 149.9)
    products.put("Keyboard", 219.99)
    products.put("Laser Point", 56.89)

    println(products)
    println(products.size)

    products.remove("Laser Point")
    println(products)

    println("R$ " + products.get("Keyboard"))
}