package com.mahammadjafarzade.booking.di

import com.mahammadjafarzade.booking.util.MySharedPreferences
import com.mahammadjafarzade.booking.util.MySharedPreferencesInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class PreferencesModule {
    @Binds
    @Singleton
    abstract fun bindReferences(pref : MySharedPreferences) : MySharedPreferencesInterface
}