package com.aednlaxer.lib.units

class Celsius(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = value
  override fun toFahrenheit() = (value * 9.0 / 5.0) + 32.0
  override fun toKelvin() = value + 273.15
  override fun toRankine() = (value + 273.15) * 9 / 5
  override fun toDelisle() = (100 - value) * 3.0 / 2.0
  override fun toNewton() = value * 33.0 / 100.0
  override fun toReaumur() = value * 4.0 / 5.0
  override fun toRomer() = value * 21.0 / 40.0 + 7.5

  override fun getSymbol(): String = "°C"
}