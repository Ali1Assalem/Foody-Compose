package com.example.foody_compose.di

import android.content.Context
import com.example.foody_compose.presentation.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

object AppModule {
    @Module
    @InstallIn(SingletonComponent ::class)
    object AppModule {

        @Singleton
        @Provides
        fun provideApplication(@ApplicationContext app: Context): BaseApplication {
            return app as BaseApplication
        }

    }
}