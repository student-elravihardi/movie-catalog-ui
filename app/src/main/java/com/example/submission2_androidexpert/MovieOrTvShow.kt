package com.example.submission2_androidexpert

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieOrTvShow(
    val poster: Int?,
    val title: String?,
    val director: String?,
    val overview: String?,
    val userScore: String?,
    val runtime: String?,
    val genre: String?
) : Parcelable