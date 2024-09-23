package com.example.planetapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class PlanetAdapter(val context: Context, val planets: List<Planet>) : BaseAdapter() {
    override fun getCount(): Int {

        // return the number of items in the data set
        return planets.size
    }

    override fun getItem(position: Int): Any {
        // returns the data item associated with the specified position in list
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
        // Returns a Unique Identifier for the item at the specified position
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // Return a View that displays the data at the specified position in the list
        val inflater  = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    }

}