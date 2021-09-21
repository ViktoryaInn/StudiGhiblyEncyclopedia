package com.example.animeapp.ui.adapter;

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.animeapp.model.AnimeShort;
import com.example.animeapp.ui.AnimeClickListener;

import androidx.recyclerview.widget.RecyclerView;
import com.example.animeapp.databinding.FragmentAnimeItemBinding

class AnimeAdapter(val list: List<AnimeShort>, var cellClickListener: AnimeClickListener) : RecyclerView.Adapter<AnimeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeHolder {
        return AnimeHolder(
            FragmentAnimeItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount() = list.count()

    override fun onBindViewHolder(holder: AnimeHolder, position: Int) {
        holder.bind(list[position], cellClickListener)
    }

}
