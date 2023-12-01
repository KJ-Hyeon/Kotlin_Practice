package com.example.kotlinex.calc

import com.example.kotlinex.abs.AbstractOperation

class Calculator(private val operator: AbstractOperation) {

    fun operator(a: Int, b: Int): Int {
        return operator.operator(a,b)
    }

    fun remain(a:Int, b:Int): Int = a%b

}