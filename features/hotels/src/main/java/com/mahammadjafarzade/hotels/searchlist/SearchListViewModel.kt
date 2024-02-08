package com.mahammadjafarzade.hotels.searchlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahammadjafarzade.data.HotelRepositoryInterface
import com.mahammadjafarzade.entities.model.HotelResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SearchListViewModel @Inject constructor(val repositoryInterface : HotelRepositoryInterface) : ViewModel() {
    val data = MutableLiveData<HotelResponse?>()

    fun getHotels(){
        viewModelScope.launch {
            repositoryInterface.getHotels().let {
                data.postValue(it)
            }
        }
    }
}