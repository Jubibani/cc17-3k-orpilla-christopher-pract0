package com.example.practiceactivity0_kotlinbasics

import kotlin.random.Random

fun main() {
    // random pounds and convert to kilograms
    val pounds = Random.nextInt(1, 300)  // Random weight between 1 and 300 pounds
    println("Weight in Pounds: $pounds (lbs)")
    val kilograms = pounds * 453592 / 1000000
    println("Converted in Kilograms: $kilograms (kg)")
    println("==================================")

    // random miles and convert to kilometers
    val miles = Random.nextInt(1, 500)
    println("Length in Miles: $miles (mi)")
    val kilometers = miles * 160934 / 100000
    println("Converted in Kilometers = $kilometers kilometers (km)")
    println("==================================")

    // random Fahrenheit and convert to Celsius
    val fahrenheit = Random.nextInt(-50, 120)
    println("Temperature from Fahrenheit: $fahrenheit (°F)")
    val celsius = (fahrenheit - 32) * 5 / 9
    println("Converted in Celsius = $celsius (°C)")
    println("==================================")
}