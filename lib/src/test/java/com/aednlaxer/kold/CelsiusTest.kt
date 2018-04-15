package com.aednlaxer.kold

import com.aednlaxer.lib.celsius
import junit.framework.TestCase.assertEquals

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CelsiusTest {

  @Test
  fun testUnitConversion() {
    assertEquals(0.0, 0.celsius().toCelsius())
    assertEquals(0.0, 0.0.celsius().toCelsius())
    assertEquals(0.0, 0L.celsius().toCelsius())
    assertEquals(0.0, 0F.celsius().toCelsius())
  }

  @Test
  fun test_from0Celsius() {
    assertEquals(0.0, 0.celsius().toCelsius().roundTo2())
    assertEquals(32.0, 0.celsius().toFahrenheit().roundTo2())
    assertEquals(273.15, 0.celsius().toKelvin().roundTo2())
    assertEquals(491.67, 0.celsius().toRankine().roundTo2())
    assertEquals(150.0, 0.celsius().toDelisle().roundTo2())
    assertEquals(0.0, 0.celsius().toNewton().roundTo2())
    assertEquals(0.0, 0.celsius().toReaumur().roundTo2())
    assertEquals(7.5, 0.celsius().toRomer().roundTo2())
  }

  @Test
  fun test_from10Celsius() {
    assertEquals(10.0, 10.celsius().toCelsius().roundTo2())
    assertEquals(50.0, 10.celsius().toFahrenheit().roundTo2())
    assertEquals(283.15, 10.celsius().toKelvin().roundTo2())
    assertEquals(509.67, 10.celsius().toRankine().roundTo2())
    assertEquals(135.0, 10.celsius().toDelisle().roundTo2())
    assertEquals(3.3, 10.celsius().toNewton().roundTo2())
    assertEquals(8.0, 10.celsius().toReaumur().roundTo2())
    assertEquals(12.75, 10.celsius().toRomer().roundTo2())
  }

  @Test
  fun test_fromMinus10Celsius() {
    assertEquals(-10.0, (-10).celsius().toCelsius().roundTo2())
    assertEquals(14.0, (-10).celsius().toFahrenheit().roundTo2())
    assertEquals(263.15, (-10).celsius().toKelvin().roundTo2())
    assertEquals(473.67, (-10).celsius().toRankine().roundTo2())
    assertEquals(165.0, (-10).celsius().toDelisle().roundTo2())
    assertEquals(-3.3, (-10).celsius().toNewton().roundTo2())
    assertEquals(-8.0, (-10).celsius().toReaumur().roundTo2())
    assertEquals(2.25, (-10).celsius().toRomer().roundTo2())
  }

  @Test
  fun test_fromCelsius_toString() {
    assertEquals("-10 °C", (-10).celsius().toString())
    assertEquals("-1 °C", (-1).celsius().toString())
    assertEquals("-0.5 °C", (-0.5).celsius().toString())
    assertEquals("0 °C", 0.celsius().toString())
    assertEquals("0.5 °C", 0.5.celsius().toString())
    assertEquals("1 °C", 1.celsius().toString())
    assertEquals("10 °C", 10.celsius().toString())
  }

}
