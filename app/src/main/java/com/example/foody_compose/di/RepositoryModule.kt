package com.example.foody_compose.di

import com.example.foody_compose.network.RecipeService
import com.example.foody_compose.network.model.RecipeDtoMapper
import com.example.foody_compose.repository.RecipeRepository
import com.example.foody_compose.repository.RecipeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService:RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ):RecipeRepositoryImpl{
        return RecipeRepositoryImpl(recipeService,recipeDtoMapper)
    }
}