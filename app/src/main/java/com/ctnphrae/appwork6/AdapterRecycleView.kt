package com.ctnphrae.appwork6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.model.view.*
import java.lang.Exception

class AdapterRecycleView(val Datatext: Array<String>, val imgid: Array<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.model, parent, false))
    }

    override fun getItemCount(): Int {
        return Datatext.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        try{
            holder?.getName.text = Datatext.get(position)
            //holder?.getimg.setImageResource(imgid.get(position))
            Glide.with(context).load(imgid.get(position)).into(holder.getimg)
        }catch (er : Exception){
            Toast.makeText(context, "${er.message}",Toast.LENGTH_LONG).show()
        }

    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val getName = view.tv_name
    val getimg = view.imgFood
}