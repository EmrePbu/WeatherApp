package com.emrepbu.weatherapp.domain.repository

import com.emrepbu.weatherapp.domain.util.Resource
import com.emrepbu.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}
