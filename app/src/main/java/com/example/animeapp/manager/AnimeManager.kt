package com.example.animeapp.manager

import android.content.Context
import com.example.animeapp.model.Anime
import com.example.animeapp.model.AnimeShort
import com.example.animeapp.network.ApiService

class AnimeManager(context: Context) {
    suspend fun getAnimeFromApi(): ArrayList<Anime>{
        val response = ApiService.getInstance().getAnimeList()
        return response.body() as ArrayList<Anime>
    }
}