package com.mahammadjafarzade.data

import com.mahammadjafarzade.entities.model.HotelResponse
import com.mahammadjafarzade.network.api.ApiService
import javax.inject.Inject

interface HotelRepositoryInterface{
    suspend fun getHotels() : HotelResponse?
}

class HotelRepository @Inject constructor(private val apiService: ApiService) : HotelRepositoryInterface{
    override suspend fun getHotels(): HotelResponse? {
        return apiService.getHotels()
    }
}