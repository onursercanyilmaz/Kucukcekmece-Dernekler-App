package com.onursercanyilmaz.kucukcekmecedernekler.service
import com.onursercanyilmaz.kucukcekmecedernekler.models.MovieJSON
import io.reactivex.Single
import retrofit2.Retrofit

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MovieAPIService {

    private val BASE_URL = "https://data.kucukcekmece.bel.tr/static/acikveri/"

    var retrofitAPI: IMovieAPI = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(IMovieAPI::class.java)


    fun getMovieList() : Single<MovieJSON>{
        return retrofitAPI.getMovieList()
    }

        
}