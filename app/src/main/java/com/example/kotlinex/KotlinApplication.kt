package com.example.kotlinex

import com.example.kotlinex.calc.AddOperation
import com.example.kotlinex.calc.Calculator
import com.example.kotlinex.calc.DivideOperation
import com.example.kotlinex.calc.MinusOperation
import com.example.kotlinex.calc.MultiplyOperation

fun calculation(num1: Int, num2: Int): Int {
    when (readln().toInt()) {
        1 -> {
            val calculator = Calculator(AddOperation())
            val result = calculator.operator(num1, num2)
            println("더하기는 $result")
            return result
        }

        2 -> {
            val calculator = Calculator(MinusOperation())
            val result = calculator.operator(num1,num2)
            println("빼기는 $result")
            return result
        }

        3 -> {
            val calculator = Calculator(MultiplyOperation())
            val result = calculator.operator(num1, num2)
            println("곱하기는 $result")
            return result
        }

        4 -> {
            val calculator = Calculator(DivideOperation())
            val result = calculator.operator(num1, num2)
            println("나누기는 $result")
            return result
        }
        else -> {
            println("잘못된 번호가 입력되었습니다")
            return 0
        }
    }
}
fun main() {
    var select = 0
    while (select != 1) {
        println("숫자를 입력해주세요")
        val num1 = readln().toInt()
        val num2 = readln().toInt()
        print("수행하고 싶은 연산을 선택해주세요: 1:더하기 2:빼기 3:곱하기 4:나누기: ")
        calculation(num1,num2)
        print("계속 연산을 하실거면 아무숫자를 그만하실거면 1번을 눌러주세요!")
        select = readln().toInt()
    }


}