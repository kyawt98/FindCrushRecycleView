package com.kyawt.findcrush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.findcrush.adapter.IndexAdapter
import com.kyawt.findcrush.model.DataClassOfIndex

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_index)

        val recyclerView: RecyclerView = findViewById(R.id.index_recycle)

        val indexArray = ArrayList<DataClassOfIndex>()
        indexArray.add(DataClassOfIndex("Adam", R.drawable.adam, R.drawable.adam))
        indexArray.add(DataClassOfIndex("Laura", R.drawable.laura, R.drawable.sunflower))

        val indexAdapter = IndexAdapter(indexArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = indexAdapter
    }
}
