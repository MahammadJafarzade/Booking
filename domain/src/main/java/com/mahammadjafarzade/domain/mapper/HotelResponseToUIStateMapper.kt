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
                slug = it.details?.slug ?: "",
                country = it.details?.description ?:"")
        } ?: listOf()
    }
}