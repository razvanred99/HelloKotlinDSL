package helloKotlinDSL.part1

import helloKotlinDSL.part1.Address

data class Person(
        var firstName: String? = null,
        var lastName: String? = null,
        var age: Int? = null,
        var address: Address? = null
)