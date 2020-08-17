package com.emrekose.pokedex.ui.detail

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.emrekose.pokedex.R
import com.emrekose.pokedex.databinding.FragmentDetailBinding
import com.emrekose.pokedex.databinding.FragmentHomeBinding
import com.emrekose.pokedex.utils.Result
import com.emrekose.pokedex.utils.extensions.toast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class DetailFragment : Fragment() {

    private val viewModel by viewModels<DetailViewModel>()
    private val args: DetailFragmentArgs by navArgs()
    private var binding: FragmentDetailBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.detailName?.text = args.pokemon.name

        viewModel.getSinglePokemon(args.pokemon.name)
        lifecycleScope.launch {
            viewModel.pokemon.collect { result ->
                when(result) {
                    is Result.Loading -> {

                    }
                    is Result.Success -> {

                    }
                    is Result.Error -> {
                        activity?.toast("Something went wrong. Please try again later")
                        Log.e("HomeFragment", result.exception.toString())
                    }
                }
            }
        }
    }
}