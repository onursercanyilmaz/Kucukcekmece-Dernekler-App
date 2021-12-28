package com.onursercanyilmaz.kucukcekmecedernekler.service

import com.onursercanyilmaz.kucukcekmecedernekler.models.DernekJSON
import io.reactivex.Single
import retrofit2.http.GET

interface IDernekAPI {
    companion object {
        const val MOVIES = "static/acikveri/dernekler.json"
    }

    @GET(MOVIES)
    fun getDernekList() : Single<DernekJSON>

}