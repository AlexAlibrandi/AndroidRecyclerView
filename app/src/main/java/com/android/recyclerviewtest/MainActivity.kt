package com.android.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imagelist = ArrayList<Int>()

    lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("United States of America")
        countryNameList.add("Germany")

        detailsList.add("This is the USA flag")
        detailsList.add("This is the german flag")

        imagelist.add(R.drawable.usa)
        imagelist.add(R.drawable.german)

        adapter = CountryAdapter(countryNameList,detailsList,imagelist,this@MainActivity)

        recyclerView.adapter = adapter

    }
}