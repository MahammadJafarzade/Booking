package com.mahammadjafarzade.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class FavoriteData (
    var id: Int = 0,
    var price: Int = 0,
    var name: String = "",
    var address: String = "",
    var result: String = "",
    var city: String = "",
    var country: String = "",
    var thumbnailImage: String = "",
    var reviewScore: Double = 0.0,
    var cityCenterPointDistance: Double = 0.0
) : Parcelable