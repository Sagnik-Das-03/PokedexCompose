package com.test.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.test.pokedex.data.remote.responses.Pokemon
import com.test.pokedex.repository.PokemonRepository
import com.test.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}