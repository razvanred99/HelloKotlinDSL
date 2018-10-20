package helloKotlinDSL.part2

import helloKotlinDSL.part2.builders.AddressBuilder
import helloKotlinDSL.part2.builders.PersonBuilder

fun main(args: Array<String>) {

    val person = person {
        firstName = "Mario"
        dateOfBirth = "2000-09-11"
        this.address = address {
            city = "San Polo di Piave"
            number = 4
            street = "Vicolo Girasole"
        }
    }

    println(person)

}

fun person(block: PersonBuilder.() -> Unit) = PersonBuilder().apply(block).build()

fun address(block: AddressBuilder.() -> Unit) = AddressBuilder().apply(block).build()