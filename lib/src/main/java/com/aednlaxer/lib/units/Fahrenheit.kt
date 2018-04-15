package com.aednlaxer.lib.units

class Fahrenheit(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = (value - 32.0) * 5.0 / 9.0
  override fun toFahrenheit() = value
  override fun toKelvin() = (value + 459.67) * 5.0 / 9.0
  override fun toRankine() = value + 459.67
  override fun toDelisle() = (212.0 - value) * 5.0 / 6.0
  override fun toNewton() = (value - 32.0) * 11.0 / 60.0
  override fun toReaumur() = (value - 32.0) * 4.0 / 9.0
  override fun toRomer() = (value - 32.0) * 7.0 / 24.0 + 7.5

  override fun getSymbol(): String = "°F"
}