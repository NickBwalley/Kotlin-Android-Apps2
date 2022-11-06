package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declaring a recyclerview object name and associatiing with XML defined recycler class
        var recyclerViewDetails : RecyclerView = findViewById(R.id.showDetailsRecycler)

        //Data source -- A list of players, each having a name and a Jersey number, created from the Player.kt class
        var players = mutableListOf(
            Player("LeBron", 23),
            Player("Kobe", 24),
            Player("Ronaldo", 7),
            Player("Messi", 30),
            Player("Pogba", 6),
            Player("Maguire", 5),
            Player("Curry", 30),
            Player("Shaq", 29),
            Player("Lukaku", 9),
            Player("Sancho", 10),)
    }
}