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
            hotels = input.getData()
        )
    }
    private fun Result.getSearchHeader() : SearchHeaderUiModel {
        return SearchHeaderUiModel(
            requestId = requestId ?: "",
            funnelId = funnelId ?:""
            )
    }
    private fun Result.getData() : List<HotelListUIModel>{
        return offers?.hotels?.map {
            HotelListUIModel(
                enuId = it.details?.id ?:"",
                name = it.details?.address?.address ?: "",
                country = it.details?.description?:"")
        } ?: listOf()
    }
}