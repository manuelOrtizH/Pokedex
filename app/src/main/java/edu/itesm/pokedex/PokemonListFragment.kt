package edu.itesm.pokedex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_pokemon_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [PokemonListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PokemonListFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pokemon_recycler.addItemDecoration(
            DividerItemDecoration(
                pokemon_recycler.getContext(),
                DividerItemDecoration.VERTICAL
            )
        )
        pokemon_recycler.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = PokemonAdapter(createData())
        }

    }

    fun createData(): ArrayList<Pokemon>{
        val poke_list = ArrayList<Pokemon>()
        poke_list.add(
            Pokemon(
                R.drawable.greninja,
                "Greninja",
                "Water & Dark",
                "Greninja es un Pokémon de tipo agua/siniestro introducido en la sexta generación. Es la evolución de Frogadier."
            )
        )
        poke_list.add(
            Pokemon(
                R.drawable.lucario,
                "Lucario",
                "Fighting & Steel",
                "Lucario es un Pokémon de tipo lucha/acero introducido en la cuarta generación. Es la evolución de Riolu. "
            )
        )
        poke_list.add(
            Pokemon(
                R.drawable.mimikyu,
                "Mimikyu",
                "Ghost & Fairy",
                "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
            )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.blastoise,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.bulbasaur,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.charizard,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.eevee,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.gengar,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.lugia,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.mudkip,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.pikachu_little,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.rayquaza,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.snorlax,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.squirtle,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )
        poke_list.add(
                Pokemon(
                        R.drawable.tyranitar,
                        "Mimikyu",
                        "Ghost & Fairy",
                        "Mimikyu es un Pokémon de tipo fantasma/hada introducido en la séptima generación."
                )
        )

        return poke_list
    }



 }