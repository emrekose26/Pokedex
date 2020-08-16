package com.emrekose.pokedex.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.emrekose.pokedex.R
import com.emrekose.pokedex.utils.Result
import com.emrekose.pokedex.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getPokemonList()

        lifecycleScope.launch {
            viewModel.pokemonList.collect { result ->
                when(result) {
                    is Result.Loading -> { Log.e("HomeFragment", result.toString()) }
                    is Result.Success -> { Log.e("HomeFragment", result.data.toString()) }
                    is Result.Error -> { Log.e("HomeFragment", result.exception.toString()) }
                }
            }
        }

    }
}