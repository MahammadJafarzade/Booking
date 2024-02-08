package com.mahammadjafarzade.entities.model

import Address
import City
import Country
import Town

data class Data (
    val address: Address,
    val country : Country,
    val countryCode : String,
    val town : Town,
    val city : City
)