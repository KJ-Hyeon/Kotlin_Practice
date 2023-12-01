package com.example.kotlinex.calc

import com.example.kotlinex.abs.AbstractOperation
import kotlin.Throws

class DivideOperation: AbstractOperation() {
    @Throws(ArithmeticException::class)
    override fun operator(a: Int, b: Int): Int {
        require(b != 0) {
            ArithmeticException("Divide by Zero")
        }
        return a / b
    }
}