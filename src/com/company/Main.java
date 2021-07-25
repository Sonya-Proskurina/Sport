package com.company;

fun main() {
        var s:String = readLine()!!
        var a:Int = s.split(" ").get(0).toInt()
        var n:Int = s.split(" ").get(1).toInt()
        for(i in 1..n){
        a = if (a%10>0) --a else a/10
        }
        print(a)
        }