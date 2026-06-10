package com.example.campsitecommander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var txtTotal: TextView
    private lateinit var etItem: EditText
    private lateinit var etCategory: EditText
    private lateinit var etQuantity: EditText
    private lateinit var etComments: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtTotal = findViewById(R.id.txtTotal)
        etItem = findViewById(R.id.etItem)
        etCategory = findViewById(R.id.etCategory)
        etQuantity = findViewById(R.id.etQuantity)
        etComments = findViewById(R.id.etComments)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnView = findViewById<Button>(R.id.btnView)

        calculateTotal()

        btnAdd.setOnClickListener {

            val item = etItem.text.toString()
            val category = etCategory.text.toString()
            val quantity = etQuantity.text.toString().toInt()
            val comment = etComments.text.toString()

            DataStore.itemNames.add(item)
            DataStore.categories.add(category)
            DataStore.quantities.add(quantity)
            DataStore.comments.add(comment)

            calculateTotal()

            etItem.text.clear()
            etCategory.text.clear()
            etQuantity.text.clear()
            etComments.text.clear()
        }

        btnView.setOnClickListener {
            startActivity(Intent(this, DetailedViewActivity::class.java))
        }
    }

    private fun calculateTotal() {

        var total = 0

        for (qty in DataStore.quantities) {
            total += qty
        }

        txtTotal.text = "Total Items Packed: $total"
    }
}