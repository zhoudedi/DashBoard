package com.dashboard.kotlin.clashhelper

import android.util.Log
import java.math.BigDecimal
import java.math.RoundingMode

class commandhelper {
    fun autoUnit(byte: String): String {
        val unitList = listOf<String>("B/S","KB/S","MB/S","GB/S")
        var index: Int = 0
        try {
            var double: Double = byte.toDouble()
            while (double >= 1024.00){
                double /= 1024
                index -=-1
            }
            return "${BigDecimal(double).setScale(2,RoundingMode.HALF_UP).toString()}${unitList[index]}"

        }catch(ex: Exception){
            Log.w("autoUnit",ex.toString())
            return "error"
        }

    }

}