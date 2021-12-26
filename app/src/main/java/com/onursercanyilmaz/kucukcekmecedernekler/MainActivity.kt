package com.onursercanyilmaz.kucukcekmecedernekler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.onursercanyilmaz.kucukcekmecedernekler.adapter.GeneralListAdapter
import com.onursercanyilmaz.kucukcekmecedernekler.view.MovieListActivity
import com.onursercanyilmaz.kucukcekmecedernekler.viewModel.MovieListViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  var movieListViewModel = MovieListViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGo.setOnClickListener{
            var intent = Intent(this,MovieListActivity::class.java)
            startActivity(intent)
        }




    }
}