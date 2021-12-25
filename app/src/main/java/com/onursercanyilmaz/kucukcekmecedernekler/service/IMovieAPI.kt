package com.onursercanyilmaz.kucukcekmecedernekler.service

import com.onursercanyilmaz.kucukcekmecedernekler.models.MovieJSON
import io.reactivex.Single
import retrofit2.http.GET

interface IMovieAPI {
    companion object {
        const val MOVIES = "country=tr&userLanguage=tr&multiple={true}"
    }

    @GET(MOVIES)
    fun getMovieList() : Single<MovieJSON>

}