package com.example.planetapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

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
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View
        if (convertView == null) {
            view = inflater.inflate(R.layout.list_item_layout, parent, false)

        } else {
            // Reuse the convertView
            view = convertView
        }
        // Bind data to the view
        val item = getItem(position) as Planet
        // Initialize the views
        val planetName = view.findViewById<TextView>(R.id.lil_tv_planetName)
        val moonCount = view.findViewById<TextView>(R.id.lil_tv_moonCount)
        val planetImage = view.findViewById<ImageView>(R.id.lil_iv_planet)

        planetImage.setImageResource(item.planetImage)
        moonCount.text = item.moonCount
        planetName.text = item.planet

        // Handling CLick Events
        view.setOnClickListener{
            Toast.makeText(context,"You CLicked: ${planets[position].planet}",Toast.LENGTH_SHORT).show()

        }
        return view
    }
}