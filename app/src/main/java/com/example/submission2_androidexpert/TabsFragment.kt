package com.example.submission2_androidexpert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_tabs.*

class TabsFragment : Fragment() {

    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        fun newInstance(index: Int): TabsFragment {
            val fragment = TabsFragment()
            val bundle = Bundle()
            bundle.putInt(ARG_SECTION_NUMBER, index)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv.setHasFixedSize(true)
        if (arguments != null) {
            val index = arguments?.getInt(ARG_SECTION_NUMBER, 0) as Int
            if(index == 0){
                val listMovie = ArrayList<MovieOrTvShow>()
                listMovie.addAll((getListMovies()))
                showRecyclerList(listMovie)
            } else {
                val listTvShow = ArrayList<MovieOrTvShow>()
                listTvShow.addAll((getListTvShows()))
                showRecyclerList(listTvShow)
            }
        }

    }

    private fun getListMovies(): ArrayList<MovieOrTvShow> {
        val dataPoster = resources.obtainTypedArray(R.array.data_movie_poster)
        val dataTitle = resources.getStringArray(R.array.data_movie_title)
        val dataDirector = resources.getStringArray(R.array.data_movie_director)
        val dataOverview = resources.getStringArray(R.array.data_movie_overview)
        val dataUserScore = resources.getStringArray(R.array.data_movie_user_score)
        val dataRuntime = resources.getStringArray(R.array.data_movie_runtime)
        val dataGenre = resources.getStringArray(R.array.data_movie_genres)

        val listMovie = ArrayList<MovieOrTvShow>()
        for (pos in dataTitle.indices) {
            val movie = MovieOrTvShow(
                dataPoster.getResourceId(pos, -1),
                dataTitle[pos],
                dataDirector[pos],
                dataOverview[pos],
                dataUserScore[pos],
                dataRuntime[pos],
                dataGenre[pos]
            )
            listMovie.add(movie)
        }
        dataPoster.recycle()
        return listMovie
    }

    private fun getListTvShows(): ArrayList<MovieOrTvShow> {
        val dataPoster = resources.obtainTypedArray(R.array.data_tvshows_poster)
        val dataTitle = resources.getStringArray(R.array.data_tvshows_title)
        val dataDirector = resources.getStringArray(R.array.data_tvshows_crew)
        val dataOverview = resources.getStringArray(R.array.data_tvshows_overview)
        val dataUserScore = resources.getStringArray(R.array.data_tvshows_user_score)
        val dataRuntime = resources.getStringArray(R.array.data_tvshows_runtime)
        val dataGenre = resources.getStringArray(R.array.data_tvshows_genres)

        val listTvShow = ArrayList<MovieOrTvShow>()
        for (pos in dataTitle.indices) {
            val tvShow = MovieOrTvShow(
                dataPoster.getResourceId(pos, -1),
                dataTitle[pos],
                dataDirector[pos],
                dataOverview[pos],
                dataUserScore[pos],
                dataRuntime[pos],
                dataGenre[pos]
            )
            listTvShow.add(tvShow)
        }
        dataPoster.recycle()
        return listTvShow
    }

    private fun showRecyclerList(list: ArrayList<MovieOrTvShow>){
        rv.layoutManager = LinearLayoutManager(view?.context)
        val listDataAdapter = RecycleViewDataAdapter(list)
        listDataAdapter.
        rv.adapter = listDataAdapter
    }

}