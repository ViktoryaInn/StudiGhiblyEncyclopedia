package com.example.animeapp.ui.anime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.animeapp.databinding.FragmentAnimeSearchBinding

class AnimeSearchFragment : Fragment(){
    private var navController: NavController?=null
    private var binding: FragmentAnimeSearchBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnimeSearchBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val inputString = binding?.animeInputString
        val searchButton = binding?.animeSearchButton
        searchButton?.setOnClickListener{
            val text = inputString?.text.toString()
            searchAnime(text)
        }
    }

    private fun searchAnime(text: String){
        if(text.isNotEmpty()){
            val bundle = bundleOf("searchStr" to text)
        }
    }
}