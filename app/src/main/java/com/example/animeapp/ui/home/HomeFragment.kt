package com.example.animeapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.animeapp.R
import com.example.animeapp.databinding.FragmentHomeBinding
import com.example.animeapp.manager.AnimeManager
import com.example.animeapp.model.Anime
import com.example.animeapp.model.AnimeShort
import com.example.animeapp.ui.AnimeClickListener
import com.example.animeapp.ui.adapter.AnimeAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    lateinit var animeManager: AnimeManager
//    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        homeViewModel =
//                ViewModelProvider(this).get(HomeViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        animeManager = AnimeManager(requireContext())

//        val anime = ArrayList<AnimeShort>()
//        for (i in 1..15) {
//            anime.add(
//                AnimeShort(
//                    i.toString(),
//                    "Some Anime Title - \$i",
//                    "Some Anime Original Title - \$i",
//                    "Some Anime Description - \$i",
//                    "Some Anime DIrector - \$i",
//                    "Some Anime Url - \$i"
//                )
//            )
//        }

//        val context = this.context

        GlobalScope.launch(Dispatchers.IO) {
            val anime = animeManager.getAnimeFromApi()
            withContext(Dispatchers.Main){
//                binding.recyclerViewAnimeHome.layoutManager = LinearLayoutManager(context)
                binding.recyclerViewAnimeHome.adapter = AnimeAdapter(anime)
            }

        }

//        val anime = ArrayList<AnimeShort>()
//        for (i in 1..15) {
//            anime.add(
//                AnimeShort(
//                    i.toString(),
//                    "Some Anime Title - \$i",
//                    "Some Anime Original Title - \$i",
//                    "Some Anime Description - \$i",
//                    "Some Anime DIrector - \$i",
//                    "Some Anime Url - \$i"
//                )
//            )
//        }



        return binding.root
//        return root
    }
}