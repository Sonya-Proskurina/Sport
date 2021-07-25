package com.company;

fun main() {
        val s: String = readLine()!!
        var a: Int = s.split(" ").get(0).toInt()
        var n = 0
        while (a>=5) {
        a-=5
        n++
        }
        while (a>=4) {
        a-=4
        n++
        }
        while (a>=3) {
        a-=3
        n++
        }
        while (a>=2) {
        a-=2
        n++
        }
        println(n+a)
        }