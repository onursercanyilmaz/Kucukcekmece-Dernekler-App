package com.onursercanyilmaz.kucukcekmecedernekler.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onursercanyilmaz.kucukcekmecedernekler.MainActivity
import com.onursercanyilmaz.kucukcekmecedernekler.R
import kotlinx.android.synthetic.main.activity_dernek_list.*
import kotlinx.android.synthetic.main.activity_main.*

class DernekListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dernek_list)

        btnBack.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}