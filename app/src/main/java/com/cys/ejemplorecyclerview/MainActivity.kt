package com.cys.ejemplorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val items:ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addItems()




        //creación del reciclerView
        var recyclerView = findViewById<RecyclerView>(R.id.reciclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false)

        recyclerView.adapter = MyAdapter(items,this)







    }

    private fun addItems(){
        items.add("Item 1")
        items.add("Item 2")
        items.add("Item 3")
        items.add("Item 4")
        items.add("Item 5")
        items.add("Item 6")
        items.add("Item 7")
        items.add("Item 8")
        items.add("Item 9")
        items.add("Item 10")


    }
}