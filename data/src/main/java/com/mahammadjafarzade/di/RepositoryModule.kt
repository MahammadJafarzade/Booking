package com.mahammadjafarzade.di

import com.mahammadjafarzade.data.HotelRepository
import com.mahammadjafarzade.data.HotelRepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun providerHotelRepository(repository: HotelRepository) : HotelRepositoryInterface
}