package com.ctnphrae.appwork6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.model.view.*

class AdapterRecycleView(val Datatext: Array<String>, val imgid: Array<Int>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.model, parent, false))
    }

    override fun getItemCount(): Int {
        return Datatext.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.getName.text = Datatext.get(position)
        holder?.getimg.setImageResource(imgid.get(position))
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val getName = view.tv_name
    val getimg = view.imgFood
}