package com.example.submission2_androidexpert.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.submission2_androidexpert.model.MovieOrTvShow
import com.example.submission2_androidexpert.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_person"
        const val EXTRA_KIND_OF_CONTENT = "kind_of_content"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = null
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val content = intent.getParcelableExtra(EXTRA_MOVIE) as MovieOrTvShow
        if(intent.getIntExtra(EXTRA_KIND_OF_CONTENT, 0) == 1) {
            lbl_director_or_creator.text = resources.getString(R.string.lbl_tvshow_creator)
        }
        txt_title.text = content.title
        txt_score.text = content.userScore
        txt_runtime.text = content.runtime
        txt_director.text = content.director
        txt_genre.text = content.genre
        txt_overview.text = content.overview
        content.poster?.let { img_poster.setImageResource(it) }
    }
}
