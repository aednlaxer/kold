package com.aednlaxer.lib.units

class Kelvin(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = value - 273.15
  override fun toFahrenheit() = value * 9.0 / 5.0 - 459.67
  override fun toKelvin() = value
  override fun toRankine() = value * 9.0 / 5.0
  override fun toDelisle() = (373.15 - value) * 3.0 / 2.0
  override fun toNewton() = (value - 273.15) * 33.0 / 100.0
  override fun toReaumur() = (value - 273.15) * 4.0 / 5.0
  override fun toRomer() = (value - 273.15) * 21.0 / 40.0 + 7.5

  override fun getSymbol(): String = "°K"
}