package com.realityexpander.daggerscopes.di

import com.realityexpander.daggerscopes.SessionTimer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object AppModule {

    @Provides
    @ViewModelScoped
    fun provideSessionTimer(): SessionTimer {
        return SessionTimer()
    }
}