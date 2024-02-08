package com.mahammadjafarzade.network.api

import com.mahammadjafarzade.entities.model.HotelResponse
import retrofit2.http.GET

interface ApiService {
    @GET("hotels")
    suspend fun getHotels() : HotelResponse?
}