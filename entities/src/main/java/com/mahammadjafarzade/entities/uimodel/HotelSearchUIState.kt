package com.mahammadjafarzade.entities.uimodel


data class HotelSearchUIState(
    val header: SearchHeaderUiModel,
    val hotels: List<HotelListUIModel>
)
data class SearchHeaderUiModel(
    val funnelId: String,
    val requestId: String
)
data class HotelListUIModel(
   var name: String,
    var country: String
)