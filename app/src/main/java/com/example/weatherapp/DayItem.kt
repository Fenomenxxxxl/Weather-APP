package com.example.weatherapp

data class DayItem(
    val NameSity: String,
    val time: String,
    val condition: String,
    val umageURL: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String,
)