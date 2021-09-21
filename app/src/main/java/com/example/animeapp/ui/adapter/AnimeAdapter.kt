package com.example.animeapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.animeapp.model.AnimeShort
import com.example.animeapp.model.Anime

import androidx.recyclerview.widget.RecyclerView
import com.example.animeapp.MainActivity
import com.example.animeapp.R
import com.example.animeapp.databinding.FragmentAnimeItemBinding
import com.example.animeapp.ui.anime.AnimeInfoFragment

class AnimeAdapter(val list: List<Anime>) : RecyclerView.Adapter<AnimeHolder>() {
    lateinit var itemBinding: FragmentAnimeItemBinding
    lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeHolder {
        itemBinding = FragmentAnimeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        mContext = parent.context
        return AnimeHolder(itemBinding)
    }

    override fun getItemCount() = list.count()

    override fun onBindViewHolder(holder: AnimeHolder, position: Int) {
        val item = list[position]
        holder.bind(item)

        val favButton = itemBinding.addAnimeButton

        val viewButton = itemBinding.viewAnimeButton
        viewButton.setOnClickListener{
            viewAnimeInformation(item)
        }
//        viewButton.setOnClickListener()
//        holder.bind(list[position])
    }

    private fun viewAnimeInformation(anime: Anime){
        val animeInfoFragment = AnimeInfoFragment()

        if(mContext is MainActivity){
            val mainActivity = mContext as MainActivity
            mainActivity.anime = anime
            mainActivity.toAnimeInfo(R.id.navigation_home, animeInfoFragment)
        }
    }

}
