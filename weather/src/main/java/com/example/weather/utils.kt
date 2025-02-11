package com.example.weather

import android.annotation.SuppressLint
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * created by Karim Haggagi Hassan Elsayed on 2/4/25
 **/
fun iconIdForWeatherCondition(weatherId: Int): Int {


    when (weatherId) {
        in 200..232 -> {
            return R.drawable.art_storm
        }
        in 300..321 -> {
            return R.drawable.art_light_rain
        }
        in 500..504 -> {
            return R.drawable.art_rain
        }
        511 -> {
            return R.drawable.art_snow
        }
        in 520..531 -> {
            return R.drawable.art_rain
        }
        in 600..622 -> {
            return R.drawable.art_snow
        }
        in 701..761 -> {
            return R.drawable.art_fog
        }
        762, 771, 781 -> {
            return R.drawable.art_storm
        }
        800 -> {
            return R.drawable.art_clear
        }
        801 -> {
            return R.drawable.art_light_clouds
        }
        in 802..804 -> {
            return R.drawable.art_clouds
        }
        in 900..906 -> {
            return R.drawable.art_storm
        }
        in 958..962 -> {
            return R.drawable.art_storm
        }
        in 951..957 -> {
            return R.drawable.art_clear
        }
        else -> {
            return R.drawable.art_storm
        }
    }
}


@SuppressLint("NewApi")
fun getCurrentDayFormatted(): String {
    // Get the current date
    val currentDate = LocalDate.now()

    // Define the desired format
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    println(currentDate.format(formatter))
    // Format the current date
    return currentDate.format(formatter)
}