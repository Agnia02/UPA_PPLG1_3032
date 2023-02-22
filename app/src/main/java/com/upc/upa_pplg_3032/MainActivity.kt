package com.upc.upa_pplg_3032

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnromm = findViewById<Button>(R.id.button3)
        val btnfacility = findViewById<Button>(R.id.button2)
        val btngallery = findViewById<Button>(R.id.button1)

        btnromm.setOnClickListener {
            val intent = Intent(this, RoomActivity::class.java)
            startActivity(intent)
        }
        btnfacility.setOnClickListener {
            val intent = Intent(this, FacilityActivity::class.java)
            startActivity(intent)
        }
        btngallery.setOnClickListener {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }
    }
}


