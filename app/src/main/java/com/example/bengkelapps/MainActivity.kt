package com.example.bengkelapps

import android.os.Bundle
import android.speech.RecognizerIntent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList("Ganti Oli", "Pergantian Oli secara rutin untuk meningkatkan daya tahan mesin", R.drawable.pergantianoli),
            ItemList("Service Rutin", "Perawatan rutin untuk memeriksa dan perbaikan part", R.drawable.servicerutin),
            ItemList("Service Ringan", "Perbaikan part tertentu yang memerlukan perbaikan ringan", R.drawable.serviceringan),
            ItemList("Upgrade Kirian CVT", "Perbaikan dan upgrade kirian CVT", R.drawable.upgradekirian),
            ItemList("Turun Mesin", "Perbaikan pada bagian mesin untuk meningkatkan daya", R.drawable.turunmesin),
        )

        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}