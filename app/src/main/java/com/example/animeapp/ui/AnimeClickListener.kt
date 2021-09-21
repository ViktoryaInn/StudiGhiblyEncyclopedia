package com.example.animeapp.ui

import com.example.animeapp.model.AnimeShort

interface AnimeClickListener{
    fun onCellClickListener(item: AnimeShort, position: Int)
}