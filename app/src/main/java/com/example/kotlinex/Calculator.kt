package com.example.kotlinex

import java.util.Objects

// 공통부 부분을 추상 클래스를 만들어서 사용 자식클래스에서 각자 클래스에 맞게 오버라이딩 하여 사용
abstract class AbstractOperation() {
    abstract fun operator(a: Int, b:Int): Int
}
// 하나의 클래스는 하나의 기능을 가진다.(책임이 많아질 수록 해당 객체의 변경에 따른 영향도의 양과 범위가 매우 커진다.)
class AddOperation(): AbstractOperation() {
    override fun operator(a: Int, b: Int): Int {
        return a+b
    }
}
class MinusOperation: AbstractOperation() {
    override fun operator(a: Int, b: Int): Int {
        return a-b
    }
}
class MultiplyOperation: AbstractOperation() {
    override fun operator(a: Int, b: Int): Int {
        return a*b
    }
}
class DivideOperation: AbstractOperation() {
    override fun operator(a: Int, b: Int): Int {
        return a/b
    }
}

class Calculator() {
    fun addOperator(a: Int, b:Int): Int {
        return AddOperation().operator(a,b)
    }
    fun minusOperator(a: Int, b:Int): Int {
        return MinusOperation().operator(a,b)
    }
    fun multiplyOperator(a: Int, b:Int): Int {
        return MultiplyOperation().operator(a,b)
    }
    fun divideOperator(a: Int, b:Int): Int {
        return DivideOperation().operator(a,b)
    }
    fun remain(a:Int, b:Int): Int = a%b
}

private fun calculation(calculator: Calculator, num1: Int, num2: Int): Int {
    when (readln().toInt()) {
        1 -> {
            val result = calculator.addOperator(num1, num2)
            println("더하기는 $result")
            return result
        }

        2 -> {
            val result = calculator.minusOperator(num1,num2)
            println("빼기는 $result")
            return result
        }

        3 -> {
            val result = calculator.multiplyOperator(num1, num2)
            println("곱하기는 $result")
            return result
        }

        4 -> {
            val result = calculator.divideOperator(num1, num2)
            println("나누기는 $result")
            return result
        }

        5 -> {
            val result = calculator.remain(num1, num2)
            println("나머지는 $result")
            return result
        }

        else -> {
            println("잘못된 번호가 입력되었습니다")
            return 0
        }
    }
}

fun main() {
    val calculator = Calculator()
    var select = 0
    while (select != 1) {
        println("숫자를 입력해주세요")
        val num1 = readln().toInt()
        val num2 = readln().toInt()
        print("수행하고 싶은 연산을 선택해주세요: 1:더하기 2:빼기 3:곱하기 4:나누기: ")
        calculation(calculator,num1,num2)
        print("계속 연산을 하실거면 아무숫자를 그만하실거면 1번을 눌러주세요!")
        select = readln().toInt()
    }
}


