package com.example.animeapp.model

data class Anime(
    val id: String,
    val title: String,
    val original_title: String,
    val original_title_romanised: String,
    val description: String,
    val director: String,
    val producer: String,
    val release_date: String,
    val running_time: String,
    val rt_score: String,
    val people: ArrayList<String>,
    val species: ArrayList<String>,
    val locations: ArrayList<String>,
    val vehicles: ArrayList<String>,
    val url: String
)