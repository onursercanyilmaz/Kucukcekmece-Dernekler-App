package com.onursercanyilmaz.kucukcekmecedernekler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.onursercanyilmaz.kucukcekmecedernekler.view.DernekListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGo.setOnClickListener{
            var intent = Intent(this,DernekListActivity::class.java)
            startActivity(intent)
        }


    }
}