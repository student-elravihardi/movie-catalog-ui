package com.example.submission2_androidexpert

import android.content.Intent
import android.content.res.TypedArray
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
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
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.lang_setting_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.lang_setting -> {
                //
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
