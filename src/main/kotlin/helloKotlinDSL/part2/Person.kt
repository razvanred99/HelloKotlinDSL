package helloKotlinDSL.part2

import java.util.*

data class Person(
        val firstName: String,
        val dateOfBirth: Date,
        val address: Address?
)