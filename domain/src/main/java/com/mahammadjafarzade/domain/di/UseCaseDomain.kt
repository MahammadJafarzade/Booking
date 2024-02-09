package com.mahammadjafarzade.domain.di

import com.mahammadjafarzade.data.HotelRepositoryInterface
import com.mahammadjafarzade.domain.mapper.HotelResponseToUIStateMapper
import com.mahammadjafarzade.domain.useCases.SearchListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class UseCaseDomain {
    @Provides
    @Singleton
    fun provideSearchUseCase(repositoryInterface : HotelRepositoryInterface,mapper: HotelResponseToUIStateMapper) = SearchListUseCase(repositoryInterface,mapper)
}