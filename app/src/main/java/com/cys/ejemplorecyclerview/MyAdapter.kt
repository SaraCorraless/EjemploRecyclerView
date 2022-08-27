package com.cys.ejemplorecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val item:ArrayList<String>, val context:Context) :RecyclerView.Adapter<MyAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.items.text = item.get(position)

        //listener en el titulo
        holder.items.setOnClickListener{
            Toast.makeText(context, holder.items.text, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        val items = view.findViewById<TextView>(R.id.textView)



    }
}