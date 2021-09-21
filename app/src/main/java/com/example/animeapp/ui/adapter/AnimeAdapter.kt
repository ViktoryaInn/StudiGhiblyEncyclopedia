package com.example.animeapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.animeapp.model.AnimeShort

import androidx.recyclerview.widget.RecyclerView
import com.example.animeapp.databinding.FragmentAnimeItemBinding

class AnimeAdapter(val list: List<AnimeShort>) : RecyclerView.Adapter<AnimeHolder>() {
    lateinit var itemBinding: FragmentAnimeItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeHolder {
        itemBinding = FragmentAnimeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeHolder(itemBinding)
    }

    override fun getItemCount() = list.count()

    override fun onBindViewHolder(holder: AnimeHolder, position: Int) {
        val item = list[position]
        holder.bind(item)

        val favButton = itemBinding.addAnimeButton

        val viewButton = itemBinding.viewAnimeButton
//        viewButton.setOnClickListener()
//        holder.bind(list[position])
    }

    private fun viewAnimeInformation(anime: AnimeShort){
//        val animeInfoFragment
    }

}
