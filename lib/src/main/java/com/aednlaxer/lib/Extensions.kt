package com.aednlaxer.lib

import com.aednlaxer.lib.units.*


fun Int.celsius() = Celsius(toDouble())
fun Long.celsius() = Celsius(toDouble())
fun Float.celsius() = Celsius(toDouble())
fun Double.celsius() = Celsius(this)

fun Int.fahrenheit() = Fahrenheit(toDouble())
fun Long.fahrenheit() = Fahrenheit(toDouble())
fun Float.fahrenheit() = Fahrenheit(toDouble())
fun Double.fahrenheit() = Fahrenheit(this)

fun Int.kelvin() = Kelvin(toDouble())
fun Long.kelvin() = Kelvin(toDouble())
fun Float.kelvin() = Kelvin(toDouble())
fun Double.kelvin() = Kelvin(this)

fun Int.rankine() = Rankine(toDouble())
fun Long.rankine() = Rankine(toDouble())
fun Float.rankine() = Rankine(toDouble())
fun Double.rankine() = Rankine(this)

fun Int.delisle() = Delisle(toDouble())
fun Long.delisle() = Delisle(toDouble())
fun Float.delisle() = Delisle(toDouble())
fun Double.delisle() = Delisle(this)

fun Int.newton() = Newton(toDouble())
fun Long.newton() = Newton(toDouble())
fun Float.newton() = Newton(toDouble())
fun Double.newton() = Newton(this)

fun Int.reaumur() = Reaumur(toDouble())
fun Long.reaumur() = Reaumur(toDouble())
fun Float.reaumur() = Reaumur(toDouble())
fun Double.reaumur() = Reaumur(this)

fun Int.romer() = Romer(toDouble())
fun Long.romer() = Romer(toDouble())
fun Float.romer() = Romer(toDouble())
fun Double.romer() = Romer(this)