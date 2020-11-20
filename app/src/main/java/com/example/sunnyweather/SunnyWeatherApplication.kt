package com.example.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
        lateinit var context: Context
        const val TOKEN = "9DZM1KnfgljFAkaz"
    }
}