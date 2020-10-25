package com.example.dhikr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dhikr.DuaAdapter.DzikirAdapter
import com.example.dhikr.DuaAdapter.dzikircontoh
import kotlinx.android.synthetic.main.activity_dzikir__shalat.*

class Dzikir_Shalat : AppCompatActivity() {

    private lateinit var dzikiradapter: DzikirAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir__shalat)


        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftar_dzikir.layoutManager = layManager

        dzikiradapter = DzikirAdapter(this,dzikircontoh.dzikirlist)
        rcv_daftar_dzikir.adapter = dzikiradapter
    }
}