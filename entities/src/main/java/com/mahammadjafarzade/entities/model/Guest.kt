package com.mahammadjafarzade.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Guest (

	val adults : Int? = null,
	val children : Int? = null
):Parcelable