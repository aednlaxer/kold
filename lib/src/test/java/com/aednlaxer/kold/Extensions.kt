package com.aednlaxer.kold

import java.math.BigDecimal

internal fun Double.roundTo2() =
  BigDecimal(this).setScale(2, BigDecimal.ROUND_HALF_UP).toDouble()
