package com.aednlaxer.lib.units

class Rankine(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = (value - 491.67) * 5.0 / 9.0
  override fun toFahrenheit() = value - 459.67
  override fun toKelvin() = value * 5.0 / 9.0
  override fun toRankine() = value
  override fun toDelisle() = (671.67 - value) * 5.0 / 6.0
  override fun toNewton() = (value - 491.67) * 11.0 / 60.0
  override fun toReaumur() = (value - 491.67) * 4.0 / 9.0
  override fun toRomer() = (value - 491.67) * 7.0 / 24.0 + 7.5

  override fun getSymbol(): String = "°R"
}