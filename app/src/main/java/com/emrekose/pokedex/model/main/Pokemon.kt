package com.emrekose.pokedex.model.main


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Pokemon(
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val url: String
) : Parcelable {
    fun getPokemonImageUrl(): String {
        val index = url.split("/".toRegex()).dropLast(1).last()
        return "https://pokeres.bastionbot.org/images/pokemon/$index.png"
    }
}