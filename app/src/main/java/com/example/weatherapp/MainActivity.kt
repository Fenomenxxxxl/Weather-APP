package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.fragment.MainFragment

class MainActivity : AppCompatActivity() {
    lateinit var Binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, MainFragment.newInstance())
            .commit()

    }
}