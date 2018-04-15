package com.aednlaxer.kold

import com.aednlaxer.lib.fahrenheit
import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FahrenheitTest {

  @Test
  fun testUnitConversion() {
    assertEquals(0.0, 0.fahrenheit().toFahrenheit())
    assertEquals(0.0, 0.0.fahrenheit().toFahrenheit())
    assertEquals(0.0, 0L.fahrenheit().toFahrenheit())
    assertEquals(0.0, 0F.fahrenheit().toFahrenheit())
  }

  @Test
  fun test_from32Fahrenheit() {
    assertEquals(0.0, 32.0.fahrenheit().toCelsius().roundTo2())
    assertEquals(32.0, 32.0.fahrenheit().toFahrenheit().roundTo2())
    assertEquals(273.15, 32.0.fahrenheit().toKelvin().roundTo2())
    assertEquals(491.67, 32.0.fahrenheit().toRankine().roundTo2())
    assertEquals(150.0, 32.0.fahrenheit().toDelisle().roundTo2())
    assertEquals(0.0, 32.0.fahrenheit().toNewton().roundTo2())
    assertEquals(0.0, 32.0.fahrenheit().toReaumur().roundTo2())
    assertEquals(7.5, 32.0.fahrenheit().toRomer().roundTo2())
  }

  @Test
  fun test_from50Fahrenheit() {
    assertEquals(10.0, 50.fahrenheit().toCelsius().roundTo2())
    assertEquals(50.0, 50.fahrenheit().toFahrenheit().roundTo2())
    assertEquals(283.15, 50.fahrenheit().toKelvin().roundTo2())
    assertEquals(509.67, 50.fahrenheit().toRankine().roundTo2())
    assertEquals(135.0, 50.fahrenheit().toDelisle().roundTo2())
    assertEquals(3.3, 50.fahrenheit().toNewton().roundTo2())
    assertEquals(8.0, 50.fahrenheit().toReaumur().roundTo2())
    assertEquals(12.75, 50.fahrenheit().toRomer().roundTo2())
  }

  @Test
  fun test_fromMinus4Fahrenheit() {
    assertEquals(-20.0, (-4).fahrenheit().toCelsius().roundTo2())
    assertEquals(-4.0, (-4).fahrenheit().toFahrenheit().roundTo2())
    assertEquals(253.15, (-4).fahrenheit().toKelvin().roundTo2())
    assertEquals(455.67, (-4).fahrenheit().toRankine().roundTo2())
    assertEquals(180.0, (-4).fahrenheit().toDelisle().roundTo2())
    assertEquals(-6.60, (-4).fahrenheit().toNewton().roundTo2())
    assertEquals(-16.0, (-4).fahrenheit().toReaumur().roundTo2())
    assertEquals(-3.0, (-4).fahrenheit().toRomer().roundTo2())
  }

  @Test
  fun test_fromFahrenheit_toString() {
    assertEquals("-10 °F", (-10).fahrenheit().toString())
    assertEquals("-1 °F", (-1).fahrenheit().toString())
    assertEquals("-0.5 °F", (-0.5).fahrenheit().toString())
    assertEquals("0 °F", 0.fahrenheit().toString())
    assertEquals("0.5 °F", 0.5.fahrenheit().toString())
    assertEquals("1 °F", 1.fahrenheit().toString())
    assertEquals("10 °F", 10.fahrenheit().toString())
  }

}
