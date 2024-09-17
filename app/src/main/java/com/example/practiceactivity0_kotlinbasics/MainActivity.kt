package com.example.practiceactivity0_kotlinbasics

import kotlin.random.Random

fun main() {
    conversion()
    averageAgeStudents()
    goofyFantasyStory()
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
    println("Length converted in Kilometers (km): $kilometers")
    println("==================================")

    // random Fahrenheit and convert to Celsius
    val fahrenheit = Random.nextInt(-50, 120)
    println("Temperature in Fahrenheit (°F): $fahrenheit")
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
fun goofyFantasyStory() {

    val hero = "Aragorn"
    val weapon = "Andúril"
    val ally = "Gandalf"
    val foe = "Sauron"
    val quest = "Destroy the One Ring"


    val story = """
        In a land of great danger and mystery, a brave hero named $hero set out on a perilous journey.
        Armed with the legendary sword $weapon, $hero was joined by the wise and powerful wizard $ally.
        Their quest was to thwart the evil plans of the dark lord $foe and $quest.
        Along the way, they faced numerous challenges and made unexpected allies.
        Together, they forged a path through darkness and hope to bring peace to the world.
    """.trimIndent()

    // Print the story
    println(story)
}