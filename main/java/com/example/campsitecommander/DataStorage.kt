package com.example.campsitecommander

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

object DataStore {

    val itemNames = ArrayList<String>()
    val categories = ArrayList<String>()
    val quantities = ArrayList<Int>()
    val comments = ArrayList<String>()

    init {
        itemNames.add("Tent")
        itemNames.add("Marshmallows")
        itemNames.add("Flashlight")

        categories.add("Shelter")
        categories.add("Food")
        categories.add("Safety")

        quantities.add(1)
        quantities.add(3)
        quantities.add(2)

        comments.add("4-person waterproof")
        comments.add("For S'mores")
        comments.add("Check batteries (AA)")
    }
}