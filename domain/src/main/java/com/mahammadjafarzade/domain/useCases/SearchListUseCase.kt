package com.mahammadjafarzade.domain.useCases

import com.mahammadjafarzade.common.flowState.Resource
import com.mahammadjafarzade.data.HotelRepositoryInterface
import com.mahammadjafarzade.domain.mapper.HotelResponseToUIStateMapper
import com.mahammadjafarzade.entities.uimodel.SearchHeaderUiModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SearchListUseCase @Inject constructor(
    private val repository : HotelRepositoryInterface,
    private val mapper : HotelResponseToUIStateMapper) {
    suspend fun getList() = flow {
        emit(Resource.Loading())
        repository.getHotels()?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Empty message error"))
    }.catch { exception->
        emit(Resource.Error(exception.localizedMessage))
    }
}