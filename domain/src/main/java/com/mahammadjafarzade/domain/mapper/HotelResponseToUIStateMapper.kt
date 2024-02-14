package com.mahammadjafarzade.domain.mapper

import android.provider.ContactsContract.Data
import com.mahammadjafarzade.entities.uimodel.HotelListUIModel
import com.mahammadjafarzade.entities.uimodel.HotelSearchUIState
import com.mahammadjafarzade.entities.uimodel.SearchHeaderUiModel
import com.mahammadjafarzade.entities.model.Result

import javax.inject.Inject

class HotelResponseToUIStateMapper @Inject constructor() : BaseMapper<Result, HotelSearchUIState> {
    override fun map(input: Result): HotelSearchUIState {
        return HotelSearchUIState(
            header = input.getSearchHeader(),
            hotels = input.getHotels()
        )
    }
    private fun Result.getSearchHeader() : SearchHeaderUiModel {
        return SearchHeaderUiModel(
            requestId = requestId ?: "",
            funnelId = funnelId ?:""
            )
    }
    private fun Result.getHotels() : List<HotelListUIModel>{
        return offers?.hotels?.map {
            HotelListUIModel(
                enuId = it.id ?: 0,
                name = it.details?.name ?: "",
                address = it.details?.address?.address ?: "",
                city = it.details?.address?.city?.name ?: "",
                country = it.details?.description ?:"",
                cityCenterPointDistance = it.details?.cityCenterPointDistance ?: 0.0,
                reviewScore = it.details?.reviewScore?.toDouble() ?: 0.0,
                image = it.details?.images?.firstOrNull()?.toString() ?: "",
                thumbnailImage = it.details?.extra?.thumbnailImage?: "",
                price = it.rooms?.firstOrNull()?.offers?.firstOrNull()?.price ?: 0
            )
        } ?: listOf()

    }
}