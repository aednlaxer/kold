# kold
Kotlin extension functions for converting temperature units

#### Installation

// TODO

#### How to use

Convert `Int`, `Long`, `Double` or `Float` from one temperature unit to another:

```kotlin
0.celsius().toFahrenheit()
273.15.celsius().toKelvin()
(-1).romer().toCelsius()
```

Get string representation:
```kotlin
0.celsius().toString() // Gives "0 °C"
```

#### Supported units

* Celsius
* Fahrenheit
* Kelvin
* Rankine
* Delisle
* Newton
* Réaumur
* Rømer

[Wikipedia: Conversion of units of temperature](https://en.wikipedia.org/wiki/Conversion_of_units_of_temperature)

#### License

```
MIT License

Copyright (c) 2018 aednlaxer

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```