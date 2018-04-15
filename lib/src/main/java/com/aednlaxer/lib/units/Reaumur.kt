package com.aednlaxer.lib.units

class Reaumur(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = value * 5.0 / 4.0
  override fun toFahrenheit() = value * 9.0 / 4.0 + 32.0
  override fun toKelvin() = value * 5.0 / 4.0 + 273.15
  override fun toRankine() = value * 9.0 / 4.0 + 491.67
  override fun toDelisle() = (80.0 - value) * 15.0 / 8.0
  override fun toNewton() = value * 33.0 / 80.0
  override fun toReaumur() = value
  override fun toRomer() = value * 21.0 / 32.0 + 7.5

  override fun getSymbol(): String = "°Ré"
}