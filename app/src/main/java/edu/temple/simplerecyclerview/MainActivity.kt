package edu.temple.simplerecyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //Step 2: Provide a LayoutManager
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val num = Array<Int>(100){i->(i+1)}
        //Step 4: Provide a RecyclerView.Adapter
        recyclerView.adapter = NumberDisplayAdapter(num)

    }
}