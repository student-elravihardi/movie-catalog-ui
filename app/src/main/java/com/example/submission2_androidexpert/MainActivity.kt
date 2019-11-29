package com.example.submission2_androidexpert

import android.content.Intent
import android.content.res.TypedArray
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*private lateinit var adapter: MovieAdapter
    private lateinit var dataPoster: TypedArray
    private lateinit var dataTitle: Array<String>
    private lateinit var dataDirector: Array<String>
    private lateinit var dataOverview: Array<String>
    private lateinit var dataUserScore: Array<String>
    private lateinit var dataReleaseYear: Array<String>
    private lateinit var dataRuntime: Array<String>
    private lateinit var dataGenre: Array<String>
    private var listOfMOvies = arrayListOf<Movie>()*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = null

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)
        tabs.setSelectedTabIndicatorColor(ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark))

        /*adapter = MovieAdapter(this)
        lv_list.adapter = adapter

        prepare()
        addItem()

        lv_list.onItemClickListener = AdapterView.OnItemClickListener{_, _, pos, _ ->
            val parcelableMovie = Movie(
                listOfMOvies[pos].poster,
                listOfMOvies[pos].title,
                listOfMOvies[pos].director,
                listOfMOvies[pos].overview,
                listOfMOvies[pos].userScore,
                listOfMOvies[pos].releaseYear,
                listOfMOvies[pos].runtime,
                listOfMOvies[pos].genre
            )

            val intentToDetailActivity = Intent(this@MainActivity, DetailActivity::class.java)
            intentToDetailActivity.putExtra(DetailActivity.EXTRA_MOVIE, parcelableMovie)
            startActivity(intentToDetailActivity)
        }*/
    }

    /*private fun prepare() {
        dataPoster = resources.obtainTypedArray(R.array.data_poster)
        dataTitle = resources.getStringArray(R.array.data_title)
        dataDirector = resources.getStringArray(R.array.data_director)
        dataOverview = resources.getStringArray(R.array.data_overview)
        dataUserScore = resources.getStringArray(R.array.data_user_score)
        dataReleaseYear = resources.getStringArray(R.array.data_release_year)
        dataRuntime = resources.getStringArray(R.array.data_runtime)
        dataGenre = resources.getStringArray(R.array.data_genres)
    }*/

    /*private fun addItem() {
        for (pos in dataTitle.indices) {
            val movie = Movie(
                dataPoster.getResourceId(pos, -1),
                dataTitle[pos],
                dataDirector[pos],
                dataOverview[pos],
                dataUserScore[pos],
                dataReleaseYear[pos],
                dataRuntime[pos],
                dataGenre[pos]
            )
            listOfMOvies.add(movie)
        }
        adapter.listOfMovies = listOfMOvies
    }*/
}
