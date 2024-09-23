package com.example.planetapp

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    // 1- view
    lateinit var listView: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        listView = findViewById(R.id.list_view)


        var planetsList = ArrayList<Planet>()

        val planet1 = Planet("Mercury", "0 Moon", R.drawable.mercury)
        val planet2 = Planet("Venus", "0 Moon", R.drawable.venus)
        val planet3 = Planet("Earth", "1 Moon", R.drawable.earth)
        val planet4 = Planet("Mars", "2 Moon", R.drawable.mars)
        val planet5 = Planet("Jupiter", "79 Moon", R.drawable.jupiter)
        val planet6 = Planet("Saturn", "83 Moon", R.drawable.saturn)
        val planet7 = Planet("Uranus", "27 Moon", R.drawable.uranus)
        val planet8 = Planet("Neptune", "14 Moon", R.drawable.neptune)
        val planet9 = Planet("Pluto", "1 M|oon", R.drawable.pluto)

        planetsList.add(planet1)
        planetsList.add(planet2)
        planetsList.add(planet3)
        planetsList.add(planet4)
        planetsList.add(planet5)
        planetsList.add(planet6)
        planetsList.add(planet7)
        planetsList.add(planet8)
        planetsList.add(planet9)


        // adapter
        var adapter = PlanetAdapter(this,planetsList)
        listView.adapter = adapter
    }
}