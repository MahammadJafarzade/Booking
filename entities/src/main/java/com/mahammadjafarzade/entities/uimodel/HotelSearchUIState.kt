package com.mahammadjafarzade.entities.uimodel

import android.adservices.adid.AdId


data class HotelSearchUIState(
    val header: SearchHeaderUiModel,
    val hotels: List<HotelListUIModel>
)
data class SearchHeaderUiModel(
    val funnelId: String,
    val requestId: String
)
data class HotelListUIModel(
    var enuId: String,
    var name: String,
    var country: String
)