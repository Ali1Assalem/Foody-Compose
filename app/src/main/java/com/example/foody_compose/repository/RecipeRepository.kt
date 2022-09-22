package com.example.foody_compose.repository

import com.example.foody_compose.domain.model.Recipe
import com.example.foody_compose.network.model.RecipeDto

interface RecipeRepository {
    suspend fun search(token:String , page:Int, query:String) : List<Recipe>
    suspend fun get(token: String,id:Int):Recipe

}

