package com.example.dhikr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dhikr.DuaAdapter.DuaAdapterPagi
import com.example.dhikr.DuaAdapter.DuaModel
import com.example.dhikr.DuaAdapter.DuaPagi
import kotlinx.android.synthetic.main.activity_dzikir_pagi.*

class DzikirPagi : AppCompatActivity() {

    private lateinit var duaAdapter:DuaAdapterPagi


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)


        val layManager = LinearLayoutManager(this)
        layManager.orientation =LinearLayoutManager.VERTICAL
        daftar_dzikir_pagi.layoutManager = layManager

        duaAdapter = DuaAdapterPagi(this,DuaModel.dualistpagi)
        daftar_dzikir_pagi.adapter = duaAdapter
    }
}