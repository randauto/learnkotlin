package com.sdcc.learnkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.sdcc.learnkotlin.adapter.ForecastListAdapter

class MainActivity : AppCompatActivity() {

    private val items = listOf<String>("Apple","Google", "Nokia", "Cannon")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        showToast("Hello cac ban!")
//        niceToast("Chao em", "Man Home", Toast.LENGTH_LONG)
        niceToast(myTag = "Home", message = "Chao em")

        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)

        forecastList.layoutManager = LinearLayoutManager(this)

        forecastList.adapter = ForecastListAdapter(items)

    }


    fun showToast(message : String, length : Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }

    fun niceToast(message: String, myTag : String = MainActivity::class.java.simpleName, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$myTag]: $message", length).show()
    }
}
