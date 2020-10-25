package com.example.dhikr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dhikr.DuaAdapter.DuaAdapterPetang
import com.example.dhikr.DuaAdapter.DuaModel
import com.example.dhikr.DuaAdapter.duamodelpetang
import kotlinx.android.synthetic.main.activity_dzikir_petang.*

class DzikirPetang : AppCompatActivity() {

    private lateinit var duaadapter: DuaAdapterPetang

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)

        val Laymanager = LinearLayoutManager(this)
        Laymanager.orientation= LinearLayoutManager.VERTICAL
        rcv_daftar_doa_petang.layoutManager = Laymanager

        duaadapter = DuaAdapterPetang(this,duamodelpetang.dualistpetang)
        rcv_daftar_doa_petang.adapter = duaadapter
    }

}