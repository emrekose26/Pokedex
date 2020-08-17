package com.emrekose.pokedex.model.detail


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonType(
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val url: String
)