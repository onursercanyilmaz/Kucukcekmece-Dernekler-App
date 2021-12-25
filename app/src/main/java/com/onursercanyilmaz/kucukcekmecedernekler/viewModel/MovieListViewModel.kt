package com.onursercanyilmaz.kucukcekmecedernekler.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onursercanyilmaz.kucukcekmecedernekler.models.MovieJSON
import com.onursercanyilmaz.kucukcekmecedernekler.service.MovieAPIService

class MovieListViewModel() : ViewModel() {

    private var movieAPIService = MovieAPIService()

    val movieListLiveData : LiveData<MovieJSON> = MutableLiveData<MovieJSON>()

    fun getMovieList()
    {

       // movieAPIService.

    }






}