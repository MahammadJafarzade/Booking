package com.mahammadjafarzade.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/*
Copyright (c) 2024 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */

@Parcelize
data class Details (

	val id : String? = null,
	val slug : String? = null,
	val address : Address? = null,
	val coordinate : Coordinate? = null,
	val description : String? = null,
	val hotelInfoDescription : String? = null,
	val facilitiesGroup : List<String>? = null,
	val suitabilities : List<String>? = null,
	val hotelDescriptions : List<String>? = null,
	val extra : Extra? = null,
	val name : String? = null,
	val images : List<String>? = null,
	val starRating : Int? = null,
	val reviewScore : Int? = null,
	val reviews : String? = null,
	val reviewInfo : String? = null,
	val reviewScoreLocalized : String? = null,
	val generalReviewScoreNote : String? = null,
	val checkInTime : String? = null,
	val checkOutTime : String? = null,
	val domestic : Boolean? = null,
	val reviewsTotalCount : String? = null,
	val cityCenterPointDistance : Double? = null,
	val cityCenterPointDistanceName : String? = null,
	val hotelConcept : List<String>? = null,
	val nearByHotels : String? = null,
	val covidInfo : String? = null,
	val imageTypes : List<String>? = null,
	val hotelAutocompleteIcon : String? = null,
	val locationDistance : String? = null,
	val policies : Policies? = null
):Parcelable