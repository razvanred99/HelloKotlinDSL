package helloKotlinDSL.part2.builders

import helloKotlinDSL.part2.Address

class AddressBuilder {

    var street = ""
    var number = 0
    var city = ""

    fun build() = Address(street, number, city)

}