package com.example.animeapp.network

import com.example.animeapp.model.AnimeList
import com.example.animeapp.model.AnimeShort
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("films")
    suspend fun getAnimeList(): Response<ArrayList<AnimeShort>>

    companion object {
        const val HOST = "https://ghibliapi.herokuapp.com/"

        fun getInstance(): ApiService = Retrofit.Builder()
            .baseUrl(HOST)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}