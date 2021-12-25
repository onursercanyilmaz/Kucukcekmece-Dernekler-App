package com.onursercanyilmaz.kucukcekmecedernekler.viewModel

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onursercanyilmaz.kucukcekmecedernekler.models.MovieJSON
import com.onursercanyilmaz.kucukcekmecedernekler.service.MovieAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class MovieListViewModel() : ViewModel() {

    private var movieAPIService = MovieAPIService()

    val movieListLiveData : MutableLiveData<MovieJSON> = MutableLiveData<MovieJSON>()

    @SuppressLint("CheckResult")
    fun getMovieList()
    {

        movieAPIService.getMovieList()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<MovieJSON>(){

                override fun onSuccess(value: MovieJSON?) {
                   movieListLiveData.value = value
                }

                override fun onError(e: Throwable?) {
                    if (e != null) {
                        e.printStackTrace()
                    }
                }

            })
    }

    }






