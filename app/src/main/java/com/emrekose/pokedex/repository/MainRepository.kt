package com.emrekose.pokedex.repository

import com.emrekose.pokedex.data.remote.PokeService
import com.emrekose.pokedex.model.PokemonResponse

import com.emrekose.pokedex.utils.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: PokeService
) {
    fun getPokemonList(): Flow<Result<PokemonResponse>> {
        return flow {
            emit(Result.Loading)
            try {
                val pokemons = apiService.getPokemonList()
                emit(Result.Success(pokemons))
            } catch (e: Exception) {
                emit(Result.Error(e))
            }
        }
    }
}