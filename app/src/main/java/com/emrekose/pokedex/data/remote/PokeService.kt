package com.emrekose.pokedex.data.remote

import com.emrekose.pokedex.model.main.Pokemon
import com.emrekose.pokedex.model.main.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeService {

    @GET("pokemon?limit=100")
    suspend fun getPokemonList(): PokemonResponse

    @GET("pokemon/{name}")
    suspend fun getSinglePokemon(@Path("name") name: String): Pokemon
}