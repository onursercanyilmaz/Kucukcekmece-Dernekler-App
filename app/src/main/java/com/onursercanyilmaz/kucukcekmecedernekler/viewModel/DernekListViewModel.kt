package com.onursercanyilmaz.kucukcekmecedernekler.viewModel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onursercanyilmaz.kucukcekmecedernekler.models.DernekJSON
import com.onursercanyilmaz.kucukcekmecedernekler.service.DernekAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class DernekListViewModel() : ViewModel() {

    private var dernekAPIService = DernekAPIService()

    val dernekListLiveData : MutableLiveData<DernekJSON> = MutableLiveData<DernekJSON>()

    @SuppressLint("CheckResult")
    fun getDernekList()
    {

        dernekAPIService.getMovieList()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<DernekJSON>(){

                override fun onSuccess(value: DernekJSON?) {
                   dernekListLiveData.value = value
                }

                override fun onError(e: Throwable?) {
                    if (e != null) {
                        e.printStackTrace()
                    }
                }

            })
    }

    }






