package com.example.foody_compose.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipe (
    val id: Int,
    val title: String,
    val publisher: String,
    val featuredImage: String,
    val rating: Int = 0,
    val sourceUrl: String,
    val ingredients: List<String> = listOf(),
    val dateAdded: String,
    val dateUpdated: String,
) : Parcelable