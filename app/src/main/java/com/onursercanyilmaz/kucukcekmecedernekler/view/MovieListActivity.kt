package com.onursercanyilmaz.kucukcekmecedernekler.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.onursercanyilmaz.kucukcekmecedernekler.MainActivity
import com.onursercanyilmaz.kucukcekmecedernekler.R
import com.onursercanyilmaz.kucukcekmecedernekler.adapter.GeneralListAdapter
import com.onursercanyilmaz.kucukcekmecedernekler.models.MovieJSON
import com.onursercanyilmaz.kucukcekmecedernekler.viewModel.MovieListViewModel
import kotlinx.android.synthetic.main.activity_dernek_list.*
import kotlinx.android.synthetic.main.activity_main.*

class MovieListActivity : AppCompatActivity() {
    private  var movieListViewModel = MovieListViewModel()
    var movieAdapter =  GeneralListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dernek_list)

        btnBack.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        rv_dernek_list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rv_dernek_list.adapter = movieAdapter

        var dernekList : ArrayList<String> = arrayListOf()
        dernekList.add("Paçalı Güvercin Aşıkları Derneği")
        dernekList.add("Semihiler Dernek")
        dernekList.add("Sivaslılar Dernek")
        dernekList.add("Erzurumlular Derneği")

        movieAdapter.getData(dernekList)

        movieListViewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)
        movieListViewModel.movieListLiveData.observe(this,{resp->
            Toast.makeText(this,resp.sayfa1?.get(5)?.kurumAdı.toString(),Toast.LENGTH_SHORT).show()

        })



    }

}