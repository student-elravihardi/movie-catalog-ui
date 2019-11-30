package com.example.submission2_androidexpert

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_in_rv.view.*

class RecycleViewDataAdapter(private val listMovieOrTvShow: ArrayList<MovieOrTvShow>): RecyclerView.Adapter<RecycleViewDataAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_in_rv, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMovieOrTvShow.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMovieOrTvShow[position])
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listMovieOrTvShow[position])
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: MovieOrTvShow) {
            with(itemView) {
                txt_title.text = data.title
                txt_description.text = data.overview
                data.poster?.let { img_poster.setImageResource(it) }
            }
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: MovieOrTvShow)
    }
}