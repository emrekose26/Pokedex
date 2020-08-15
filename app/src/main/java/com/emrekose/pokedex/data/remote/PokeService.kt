package com.emrekose.pokedex.data.remote

import com.emrekose.pokedex.model.Pokemon
import com.emrekose.pokedex.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeService {

    @GET("pokemon")
    suspend fun getPokemonList(): PokemonResponse

    @GET("pokemon/{name}")
    suspend fun getSinglePokemon(@Path("name") name: String): Pokemon
}