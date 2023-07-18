package com.kotlinliza.recyclerre

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter(val context: Context,val list: List<String>):RecyclerView.Adapter<Adapter.ItemHolder>() {

    inner class ItemHolder(itemView: View):ViewHolder(itemView){
        val item=itemView.findViewById<TextView>(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val view=LayoutInflater.from(context).inflate(R.layout.item,parent,false)
      return ItemHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
      val item=list[position]
        holder.item.text=item
    }
}