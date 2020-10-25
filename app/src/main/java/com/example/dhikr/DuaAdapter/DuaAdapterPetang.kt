package com.example.dhikr.DuaAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dhikr.R
import kotlinx.android.synthetic.main.lay_doa_pagi.view.*
import kotlinx.android.synthetic.main.lay_doa_petang.view.*

class DuaAdapterPetang (val context: Context,val listduapetang: List<DuaPetang>):
    RecyclerView.Adapter<DuaAdapterPetang.MyViewHolder>(){
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var currentdua: DuaPetang? = null

        fun setdata (currdua: DuaPetang){
            itemView.tv_title_petang.text = currdua!!.title
            itemView.tv_doa_petang.text = currdua!!.doa
            itemView.taawudz2.text = currdua!!.taawudz
            itemView.tv_faedah_menu.text = currdua!!.makna
            itemView.tv_faedah_dzikir.text = currdua!!.faedah
            itemView.tv_artidoa_petang.text = currdua!!.artidoa

            this.currentdua
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_doa_petang,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datadua = listduapetang[position]
        holder.setdata(datadua)
    }

    override fun getItemCount(): Int {
        return listduapetang.size
    }
}