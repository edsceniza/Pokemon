package edna.ceniza.com.pokemon

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.adapter_pokemon.view.*

/**
 * Created by Edna Ceniza on 07/03/2018.
 */
class PokemonAdapter (val pokeList: ArrayList<Pokemon>): RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_pokemon, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return pokeList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val pokemon: Pokemon = pokeList[position]
        holder?.view?.poke_name?.text = pokemon.poke_name
        val pokemonImage = holder?.view?.poke_img
        Picasso.with(holder?.view?.context).load(pokemon.poke_img.front_default).into(pokemonImage)
    }

    class ViewHolder (val view: View): RecyclerView.ViewHolder(view){

    }
}




