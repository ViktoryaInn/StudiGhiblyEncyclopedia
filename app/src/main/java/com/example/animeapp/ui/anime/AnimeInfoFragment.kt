package com.example.animeapp.ui.anime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.animeapp.databinding.FragmentAnimeInfoBinding
import com.example.animeapp.manager.AnimeManager
import com.example.animeapp.model.Anime

class AnimeInfoFragment: Fragment() {
    lateinit var anime: Anime
    lateinit var animeManager: AnimeManager
    private lateinit var binding: FragmentAnimeInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnimeInfoBinding.inflate(inflater, container, false)
        animeManager = AnimeManager(requireContext())


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}