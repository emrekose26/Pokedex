package com.emrekose.pokedex.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emrekose.pokedex.model.Pokemon
import com.emrekose.pokedex.model.PokemonResponse
import com.emrekose.pokedex.repository.MainRepository
import com.emrekose.pokedex.utils.Result
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@ExperimentalCoroutinesApi
class MainViewModel @ViewModelInject constructor(
    private val repository: MainRepository
): ViewModel() {

    private val _pokemonList = MutableStateFlow<Result<PokemonResponse>>(Result.Loading)
    val pokemonList: StateFlow<Result<PokemonResponse>> = _pokemonList

    fun getPokemonList() {
        repository.getPokemonList()
            .onEach {
                _pokemonList.value = it
            }
            .launchIn(viewModelScope)
    }
}