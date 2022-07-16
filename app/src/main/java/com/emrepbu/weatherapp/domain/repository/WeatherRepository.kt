package com.emrepbu.weatherapp.domain.repository

import com.emrepbu.weatherapp.domain.weather.WeatherInfo
import com.emrepbu.weatherapp.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}