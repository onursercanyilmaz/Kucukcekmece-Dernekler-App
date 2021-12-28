package com.onursercanyilmaz.kucukcekmecedernekler.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.onursercanyilmaz.kucukcekmecedernekler.R
import com.onursercanyilmaz.kucukcekmecedernekler.adapter.GeneralListAdapter
import com.onursercanyilmaz.kucukcekmecedernekler.viewModel.DernekListViewModel
import kotlinx.android.synthetic.main.activity_dernek_list.*

class DernekListActivity : AppCompatActivity() {
    private  var dernekListViewModel = DernekListViewModel()
    var dernekAdapter =  GeneralListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dernek_list)

        btnBack.setOnClickListener{
            onBackPressed()
        }



        rv_dernek_list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rv_dernek_list.adapter = dernekAdapter

        var dernekList : ArrayList<String> = arrayListOf()
        dernekList.add("Paçalı Güvercin Aşıkları Derneği")
        dernekList.add("Semihiler Dernek")
        dernekList.add("Sivaslılar Dernek")
        dernekList.add("Erzurumlular Derneği")

        dernekAdapter.getData(dernekList)


        dernekListViewModel = ViewModelProvider(this).get(DernekListViewModel::class.java)
        dernekListViewModel.getDernekList()
        dernekListViewModel.dernekListLiveData.observe(this, Observer{ resp->
           Toast.makeText(this, resp.sayfa1?.get(2)?.kurumAdi.toString(), Toast.LENGTH_SHORT).show()
            Log.i("filter", resp.sEFAKÖYPMA?.get(5)?.kurumAdi.toString())




            val kurumAdi = arrayListOf<String>()
            val adresDetay = arrayListOf<String>()
            val nevi = arrayListOf<String>()

            for(i in resp.sEFAKÖYPMA!!)
            {
                kurumAdi.add(i?.kurumAdi.toString())
                adresDetay.add(i?.adresDetay.toString())
                nevi.add(i?.nevi.toString())

            }

            dernekAdapter.getData(kurumAdi)






        })





    }

}








