package com.example.kotlinex

class ReservationHotel {

    fun reserve() {

    }

}

fun main() {
    initReserve()
}

fun initReserve() {
    val reserveHotel = ReservationHotel()
    println("호텔 예약 프로그램입니다.")
    println("[메뉴]")
    println("1. 방예약 | 2. 예약목록 출력 | 3.예약목록(정렬) 출력 | 4. 시스템 종료 | 5.금액 입금-출 내역 목 출력 | 6. 예약 변경/취소")
    when(readln().toInt()) {
        1 -> reserveHotel.reserve()
        4 -> return
    }
}