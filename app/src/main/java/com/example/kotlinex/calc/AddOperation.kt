package com.example.kotlinex.calc

import com.example.kotlinex.abs.AbstractOperation

class AddOperation: AbstractOperation() {
    override fun operator(a: Int, b: Int): Int = a + b
}