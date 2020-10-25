package com.example.dhikr.DuaAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dhikr.R
import kotlinx.android.synthetic.main.lay_doa_pagi.view.*
import kotlinx.android.synthetic.main.lay_doa_petang.view.*

class DuaAdapterPagi(val context: Context, val listduapagi: List<DuaPagi>) :
    RecyclerView.Adapter<DuaAdapterPagi.MyViewHolder>(){
inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var currentdua: DuaPagi? = null


    fun setData (currdua: DuaPagi){
        itemView.title_pagi.text = currdua!!.title
        itemView.taawudz.text = currdua!!.taawudz
        itemView.doa_pagi.text = currdua!!.doa
        itemView.artidoa_pagi.text = currdua!!.artidoa
        itemView.tv_faedah.text = currdua!!.makna
        itemView.faedah_pagi.text = currdua!!.faedah

        this.currentdua
    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.lay_doa_pagi,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datadua =listduapagi[position]
        holder.setData(datadua) //,position)

    }

    override fun getItemCount(): Int {
        return listduapagi.size
    }


}