package com.example.dhikr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dhikr.DuaAdapter.DuaAdapterPagi
import com.example.dhikr.DuaAdapter.DuaModel
import com.example.dhikr.DuaAdapter.DuaPagi
import kotlinx.android.synthetic.main.activity_dzikir_pagi.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnpindahduapagi:Button = findViewById(R.id.dzikir_pagi)
        btnpindahduapagi.setOnClickListener(this)

        val btnpindahduapetang:Button = findViewById(R.id.dzikir_petang)
        btnpindahduapetang.setOnClickListener(this)

        val btnpindahdzikir:Button = findViewById(R.id.btn_dzikir)
        btnpindahdzikir.setOnClickListener(this)

        val btnpindahnotifikasi:Button = findViewById(R.id.btn_notifikasi)
        btnpindahnotifikasi.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.dzikir_pagi -> {
                val move_to_pagi = Intent(this@MainActivity,DzikirPagi::class.java)
                startActivity(move_to_pagi)
            }

            R.id.dzikir_petang ->{
                val move_to_petang = Intent (this@MainActivity,DzikirPetang::class.java)
                startActivity(move_to_petang)
            }
            R.id.btn_dzikir -> {
                val move_to_dzikir = Intent (this@MainActivity,Dzikir_Shalat::class.java)
                startActivity(move_to_dzikir)
            }
            R.id.btn_notifikasi ->{
                val move_to_notif = Intent(this@MainActivity,Notifikasi::class.java)
                startActivity(move_to_notif)
            }
        }
    }

/*          val layManager = LinearLayoutManager(this)
       layManager.orientation = LinearLayoutManager.VERTICAL
       daftar_dzikir_pagi.layoutManager = layManager

       adapterPagi = DuaAdapterPagi(this,DuaModel.newslistpagi)
       daftar_dzikir_pagi.adapter = adapterPagi

       adapterPagi.setOnClickCallBack(object : DuaAdapterPagi.onItemClickCallBack {
           override fun onItemClick(data: DuaPagi) {
               val intent = Intent(this@MainActivity,DzikirPagi::class.java)
                   .apply {
                       putExtra()
                   }
           }
       })*/

}