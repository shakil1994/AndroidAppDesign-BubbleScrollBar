package com.example.shakil.kotlinbubblescrollbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.example.shakil.kotlinbubblescrollbar.Adapter.MyAdapter
import com.trendyol.bubblescrollbarlib.BubbleTextProvider
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import java.util.*

class MainActivity : AppCompatActivity() {

    internal var listData: MutableList<String> = ArrayList()

    lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        //View
        recycler_view.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.addItemDecoration(DividerItemDecoration(this, layoutManager.orientation))

        Collections.sort(listData)
        recycler_view.adapter = MyAdapter(listData)

        bubble_scroll.attachToRecyclerView(recycler_view)
        bubble_scroll.bubbleTextProvider = BubbleTextProvider { position ->
            StringBuilder(listData[position].substring(0, 1)).toString()
        }
    }

    private fun initData() {
        listData.add("Arnob")
        listData.add("Anondita")
        listData.add("Anas")
        listData.add("Anis")
        listData.add("Afzal")

        listData.add("Shakil")
        listData.add("Shuvo")
        listData.add("Shanti")
        listData.add("Sumiya")
        listData.add("Shrabonty")

        listData.add("Kamrul")
        listData.add("Korim")
        listData.add("Kamal")
        listData.add("Kemi")
        listData.add("Kanta")

        listData.add("Tanmoy")
        listData.add("Tanha")
        listData.add("Tomal")
        listData.add("Tom")
        listData.add("Tapos")

        listData.add("Nishan")
        listData.add("Nowrin")
        listData.add("Nadia")
        listData.add("Nabila")
        listData.add("Nowsin")

        listData.add("Rima")
        listData.add("Rohim")
        listData.add("Rebeka")
        listData.add("Rabbi")
        listData.add("Rohima")

        listData.add("Mimi")
        listData.add("Mitu")
        listData.add("Mizan")
        listData.add("Minhaj")
        listData.add("Mitul")

        listData.add("Limu")
        listData.add("Liton")
        listData.add("Lima")
        listData.add("Lamiya")
        listData.add("Lamima")
    }
}
