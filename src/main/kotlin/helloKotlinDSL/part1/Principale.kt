package helloKotlinDSL.part1

fun main(args: Array<String>) {
    val address = address {
        country = "Italy"
        street = "Vicolo Girasole"
    }

    val person = person {
        firstName = "Razvan"
        lastName = "Rosu"
        age = 19
        this.address = address
    }

    println(person)
}

private fun address(block: Address.() -> Unit) = Address().apply(block) //Address.apply{ block }

private fun person(block: Person.() -> Unit) = Person().apply(block)
