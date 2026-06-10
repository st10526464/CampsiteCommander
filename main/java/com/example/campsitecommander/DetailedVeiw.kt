package com.example.campsitecommander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_veiw)

        val txtDetails = findViewById<TextView>(R.id.txtDetails)
        val btnBack = findViewById<Button>(R.id.btnBack)

        var displayText = ""

        for (i in DataStore.itemNames.indices) {

            displayText +=
                "Item: ${DataStore.itemNames[i]}\n" +
                        "Category: ${DataStore.categories[i]}\n" +
                        "Quantity: ${DataStore.quantities[i]}\n" +
                        "Comments: ${DataStore.comments[i]}\n\n"
        }

        txtDetails.text = displayText

        btnBack.setOnClickListener {
            finish()
        }
    }
}