package io.github.nowakprojects.springwebfluxlearning.quote.model

import java.math.BigDecimal
import java.math.MathContext
import java.time.Instant


data class Quote(
        var ticker: String,
        var price: BigDecimal,
        val instant: Instant?
) {

    constructor() : this("", BigDecimal.ZERO, null)

    constructor(ticker: String, price: BigDecimal) : this(ticker, price, null)

    constructor(ticker: String, price: Double) : this(ticker, BigDecimal(price, MATH_CONTEXT), null)

    companion object {
        val MATH_CONTEXT = MathContext(2);
    }

}