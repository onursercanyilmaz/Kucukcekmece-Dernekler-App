package com.onursercanyilmaz.kucukcekmecedernekler.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.onursercanyilmaz.kucukcekmecedernekler.MainActivity
import com.onursercanyilmaz.kucukcekmecedernekler.R
import com.onursercanyilmaz.kucukcekmecedernekler.adapter.GeneralListAdapter
import kotlinx.android.synthetic.main.activity_dernek_list.*
import kotlinx.android.synthetic.main.activity_main.*

class MovieListActivity : AppCompatActivity() {
    var dernekAdapter =  GeneralListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dernek_list)

        btnBack.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        rv_dernek_list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rv_dernek_list.adapter = dernekAdapter

        var dernekList : ArrayList<String> = arrayListOf()
        dernekList.add("Paçalı Güvercin Aşıkları Derneği")
        dernekList.add("Semihiler Dernek")
        dernekList.add("Sivaslılar Dernek")
        dernekList.add("Erzurumlular Derneği")

        dernekAdapter.getData(dernekList)



    }

}