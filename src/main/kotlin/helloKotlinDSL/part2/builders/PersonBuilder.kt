package helloKotlinDSL.part2.builders

import helloKotlinDSL.part2.Address
import helloKotlinDSL.part2.Person
import java.text.SimpleDateFormat
import java.util.*

class PersonBuilder {

    var firstName = ""

    private var dob = Date()

    var dateOfBirth = ""
        set(value) {
            dob = SimpleDateFormat("yyyy-MM-dd").parse(value)
        }

    var address: Address? = null

    fun build()=Person(firstName, dob, address)

}