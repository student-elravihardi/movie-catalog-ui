package com.example.submission2_androidexpert

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = null
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val content = intent.getParcelableExtra(EXTRA_MOVIE) as MovieOrTvShow
        val text = "${content.title}"
        txt_title.text = text
        txt_score.text = content.userScore
        txt_runtime.text = content.runtime
        txt_director.text = content.director
        txt_genre.text = content.genre
        txt_overview.text = content.overview
        content.poster?.let { img_poster.setImageResource(it) }

        /*Glide.with(this.applicationContext)
            .load(movie.poster)
            .apply(
                RequestOptions().override(160, 240)
            )
            .into(img_poster)*/
    }
}
