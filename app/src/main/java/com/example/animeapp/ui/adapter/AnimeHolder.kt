package com.example.animeapp.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.animeapp.databinding.FragmentAnimeItemBinding
import com.example.animeapp.model.AnimeShort
import com.example.animeapp.ui.AnimeClickListener

class AnimeHolder(private val binding: FragmentAnimeItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: AnimeShort) {
        binding.animeTitle.text = item.title
        binding.animeOriginalTitle.text = item.original_title
        binding.animeDescription.text = item.description
        binding.animeDirector.text = item.director
    }

}