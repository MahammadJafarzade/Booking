package com.mahammadjafarzade.hotels.searchlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mahammadjafarzade.common.flowState.Resource
import com.mahammadjafarzade.common.flowState.State
import com.mahammadjafarzade.domain.mapper.HotelResponseToUIStateMapper
import com.mahammadjafarzade.domain.useCases.SearchListUseCase
import com.mahammadjafarzade.entities.uimodel.HotelSearchUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject


@HiltViewModel
class SearchListViewModel @Inject constructor(
    val searchListUseCase: SearchListUseCase,
    private val mapper: HotelResponseToUIStateMapper) : ViewModel() {
    val state : MutableStateFlow<State?> = MutableStateFlow(null)

    val data = MutableLiveData<HotelSearchUIState?>()


    suspend fun getHotels(){
        searchListUseCase.getList().collectLatest{
            when(it){
                is Resource.Error -> state.emit(State.error(it.message))
                is Resource.Loading -> state.emit(State.loading())
                is Resource.Success -> {
                    state.emit(State.success())
                        it.data?.result?.let {
                            val mappedData = mapper.map(it)
                            data.postValue(mappedData)
                        }
                }
            }
        }
    }
}