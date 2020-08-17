package com.emrekose.pokedex.model.detail


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonTypes(
    @Json(name = "slot")
    val slot: Int,
    @Json(name = "type")
    val type: PokemonType
)