package com.aednlaxer.lib.units

abstract class TemperatureUnit(protected val value: Double) {
  abstract fun toCelsius(): Double
  abstract fun toFahrenheit(): Double
  abstract fun toKelvin(): Double
  abstract fun toRankine(): Double
  abstract fun toDelisle(): Double
  abstract fun toNewton(): Double
  abstract fun toReaumur(): Double
  abstract fun toRomer(): Double

  abstract fun getSymbol(): String?

  fun toString(decimalValues: Int): String =
    String.format(".${decimalValues}f ${getSymbol() ?: ""}")

  override fun toString() = toString(decimalValues = 2)
}