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

        val view = binding.root

        binding.animeInfoTitle.text = anime.title
        binding.animeInfoRaiting.rating = anime.rt_score.toFloat() / 20
        binding.animeInfoDescription.text = anime.description
        binding.animeInfoDirector.text = anime.director
        binding.animeInfoProducer.text = anime.producer
        binding.animeInfoReleaseDate.text = anime.release_date
        binding.animeInfoRunningTime.text = anime.running_time
        binding.animeInfoOriginalTitle.text = anime.original_title
        binding.animeInfoOriginalTitleRomanised.text = anime.original_title_romanised

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}