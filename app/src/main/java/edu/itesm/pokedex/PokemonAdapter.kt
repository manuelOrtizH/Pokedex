package edu.itesm.pokedex

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pokemon_row.view.*

class PokemonAdapter(private val poke_list: List<Pokemon>)
    : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    var context: Context? = null

    inner class PokemonViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var poke_name = renglon.findViewById<TextView>(R.id.name)
        var poke_type = renglon.findViewById<TextView>(R.id.type)
        var poke_des = renglon.findViewById<TextView>(R.id.description)
        var poke_pic = renglon.findViewById<ImageView>(R.id.picture)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PokemonAdapter.PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.pokemon_row, parent, false)
        return PokemonViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: PokemonAdapter.PokemonViewHolder, position: Int) {
        val pokemon = poke_list[position]
        holder.poke_pic.setImageResource(pokemon.picture)
        holder.poke_name.text = pokemon.name
        holder.poke_type.text = pokemon.type
        holder.poke_des.text = pokemon.description

        context = holder.itemView.context

        holder.itemView.setOnClickListener{
            val text = "Hello " +pokemon.name+ " you are nice!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(context, text, duration)
            toast.show()
        }

    }

    override fun getItemCount(): Int {
        return poke_list.size
    }




}