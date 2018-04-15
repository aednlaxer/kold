package com.aednlaxer.lib.units

class Newton(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = value * 100.0 / 33.0
  override fun toFahrenheit() = value * 60.0 / 11.0 + 32.0
  override fun toKelvin() = value * 100.0 / 33.0 + 273.15
  override fun toRankine() = value * 60.0 / 11.0 + 491.67
  override fun toDelisle() = (33.0 - value) * 50.0 / 11.0
  override fun toNewton() = value
  override fun toReaumur() = value * 80.0 / 33.0
  override fun toRomer() = value * 35.0 / 22.0 + 7.5

  override fun getSymbol(): String = "°N"
}