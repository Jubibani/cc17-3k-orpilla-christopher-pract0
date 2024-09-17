package com.example.practiceactivity0_kotlinbasics

import kotlin.random.Random

fun main() {
    conversion()
    averageAgeStudents()
}
fun conversion() {
    // random pounds and convert to kilograms
    val pounds = Random.nextInt(1, 300)  // Random weight between 1 and 300 pounds
    println("Weight in Pounds (lbs): $pounds")
    val kilograms = pounds * 453592 / 1000000
    println("Weight converted in Kilograms (kg): $kilograms")
    println("==================================")

    // random miles and convert to kilometers
    val miles = Random.nextInt(1, 500)
    println("Length in Miles (mi): $miles")
    val kilometers = miles * 160934 / 100000
    println("Length converted in Kilometers (km): $kilometers kilometers")
    println("==================================")

    // random Fahrenheit and convert to Celsius
    val fahrenheit = Random.nextInt(-50, 120)
    println("Temperature from Fahrenheit (°F): $fahrenheit")
    val celsius = (fahrenheit - 32) * 5 / 9
    println("Temperature converted in Celsius (°C): $celsius ")
    println("==================================")
}
fun averageAgeStudents() {

    val ages: List<Int> = List(10) {Random.nextInt(18,28) }

    ages.forEachIndexed { index, age ->
        println("Age of Student ${index + 1}: $age")
    }

    val age_average = ages.average()

    println("The average age of the students is: $age_average")
    println("==================================")
}
