package com.onursercanyilmaz.kucukcekmecedernekler.service
import com.onursercanyilmaz.kucukcekmecedernekler.models.DernekJSON
import io.reactivex.Single
import retrofit2.Retrofit

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DernekAPIService {

    private val BASE_URL = "https://data.kucukcekmece.bel.tr/"

    var retrofitAPI: IDernekAPI = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(IDernekAPI::class.java)


    fun getMovieList() : Single<DernekJSON>{
        return retrofitAPI.getDernekList()
    }

        
}