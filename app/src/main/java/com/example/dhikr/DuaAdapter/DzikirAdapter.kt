package com.example.dhikr.DuaAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dhikr.R
import kotlinx.android.synthetic.main.lay_dzikir_sholat.view.*

class DzikirAdapter(val context: Context, val listdzikir: List<DzikirModel>):
RecyclerView.Adapter<DzikirAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var currentdzikir:DzikirModel? = null
        var currentposition:Int = 0

        fun setData(currdzikir:DzikirModel, currpos:Int){
            itemView.tv_membaca.text = currdzikir!!.title
            itemView.tv_dzikir.text = currdzikir!!.dzikir
            itemView.tv_artidzikir.text = currdzikir!!.arti
            itemView.tv_makna.text = currdzikir!!.makna
            itemView.tv_faedah_dzikir_shalat.text = currdzikir!!.faedah

            this.currentdzikir
            this.currentposition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val View = LayoutInflater.from(context).inflate(R.layout.lay_dzikir_sholat,parent,false)
        return MyViewHolder(View)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datadzikir = listdzikir[position]
        holder.setData(datadzikir, position)
    }

    override fun getItemCount(): Int {
        return listdzikir.size
    }
}