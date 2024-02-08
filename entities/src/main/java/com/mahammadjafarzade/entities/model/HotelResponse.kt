package com.mahammadjafarzade.entities.model

import Address
import City
import Country
import Town
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HotelResponse (
    val address: Address,
    val country : Country,
    val countryCode : String,
    val town : Town,
    val city : City
):Parcelable