package com.example.listviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import kotlin.String as String1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)

        lvMenu.onItemClickListener = ListItemClicklistner()


    }
    private inner class ListItemClicklistner : AdapterView.OnItemClickListener {
        override fun onItemClick(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            if (parent != null) {
                val item = parent.getItemAtPosition(position)as kotlin.String
                val show = "あなたが選んだ定食:" + item

                Toast.makeText(applicationContext, show, Toast.LENGTH_LONG).show()
            }



        }
    }
}
