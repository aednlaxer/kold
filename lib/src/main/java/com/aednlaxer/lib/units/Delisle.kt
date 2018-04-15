package com.aednlaxer.lib.units

class Delisle(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = 100.0 - value * 2.0 / 3.0
  override fun toFahrenheit() = 212.0 - value * 6.0 / 5.0
  override fun toKelvin() = 373.15 - value * 2.0 / 3.0
  override fun toRankine() = 671.67 - value * 6.0 / 5.0
  override fun toDelisle() = value
  override fun toNewton() = 33.0 - value * 11.0 / 50.0
  override fun toReaumur() = 80.0 - value * 8.0 / 15.0
  override fun toRomer() = 60.0 - value * 7.0 / 20.0

  override fun getSymbol(): String = "°De"
}