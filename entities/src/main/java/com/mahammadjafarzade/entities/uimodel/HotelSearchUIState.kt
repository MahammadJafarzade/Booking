package com.mahammadjafarzade.entities.uimodel

import com.mahammadjafarzade.entities.model.Address
import com.mahammadjafarzade.entities.model.City


data class HotelSearchUIState(
    val header: SearchHeaderUiModel,
    val hotels: List<HotelListUIModel>
)
data class SearchHeaderUiModel(
    val funnelId: String,
    val requestId: String
)
data class HotelListUIModel(
    var enuId: Int,
    var name: String,
    var address: String,
    var city: String,
    var country: String,
    val reviewScore: Double,
    val cityCenterPointDistance: Double,
    val image: String,
    val thumbnailImage: String,
    val price: Int
)