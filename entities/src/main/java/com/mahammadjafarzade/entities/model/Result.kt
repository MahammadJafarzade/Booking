package com.mahammadjafarzade.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Result (
	val requestId : String? = null,
	val funnelId : String? = null,
	val offers : Offers? = null,
	val filters : List<Filters>? = null,
	val sortingMethods : List<SortingMethods>? = null,
	val searchUrl : String? = null
):Parcelable