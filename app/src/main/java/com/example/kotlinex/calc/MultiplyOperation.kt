package com.example.kotlinex.calc

import com.example.kotlinex.abs.AbstractOperation

class MultiplyOperation: AbstractOperation() {
    override fun operator(a: Int, b: Int): Int = a * b
}