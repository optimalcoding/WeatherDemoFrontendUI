package com.example.weatherdemom3eui.data.model

import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    val locationName: String,
    val cwa: String,
    val gridX: Int,
    val gridY: Int,
    val current: CurrentConditions,
    val activeAlertHeadline: String? = null,
    val latestRadarPath: String? = null,
    val hourlyMeteogram: List<HourlyPoint> = emptyList()
)

@Serializable
data class CurrentConditions(
    val temperatureF: Double,
    val dewPointF: Double,
    val relativeHumidity: Int,
    val windSpeedMph: Double,
    val cloudBaseMeters: Double
)

@Serializable
data class HourlyPoint(
    val hourLabel: String,
    val tempF: Double,
    val dewPointF: Double,
    val relativeHumidity: Int,
    val popPercent: Int,
    val windSpeedMph: Double,
    val windGustMph: Double? = null,
    val hasThunder: Boolean = false
)
