package com.aednlaxer.lib.units

class Romer(value: Double) : TemperatureUnit(value) {
  override fun toCelsius() = (value - 7.5) * 40.0 / 21.0
  override fun toFahrenheit() = (value - 7.5) * 24.0 / 7.0 + 32.0
  override fun toKelvin() = (value - 7.5) * 40.0 / 21.0 + 273.15
  override fun toRankine() = (value - 7.5) * 24.0 / 7.0 + 491.67
  override fun toDelisle() = (60 - value) * 20.0 / 7.0
  override fun toNewton() = (value - 7.5) * 22.0 / 35.0
  override fun toReaumur() = (value - 7.5) * 32.0 / 21.0
  override fun toRomer() = value

  override fun getSymbol(): String = "°Rø"
}