package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter(var player: List<Player>):RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    inner class PlayerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    //Override abstract methods - CTRL + I
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        // Inflate student_info
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_info, parent, false)

        return PlayerViewHolder(view) // return PlayerAdapter.PlayerViewHolder object

    }

    //After the lahout file has been inflated in the onCreateView older
    //access individual elements via user declared object names and store data in them
    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        var playerNameTV: TextView = holder.itemView.findViewById(R.id.showName)
        var playerJerseyTV: TextView = holder.itemView.findViewById(R.id.showJersey)

        var currentName = player[position].name
        var currentJersey = player[position].jerseyNo

        playerNameTV.text = currentName
        playerJerseyTV.text = currentJersey.toString()
    }

    // returns the number of data objects present to be displayed on the recyclerview
    override fun getItemCount(): Int {
        return player.size
    }
}