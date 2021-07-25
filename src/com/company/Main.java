fun main() {
        var s: String = readLine()!!
        var nBig=0
        var nLite=0
        for (i in 0..s.length-1){
        if (s[i].toInt()>=65&&s[i].toInt()<=90){
        nBig++
        }
        if (s[i].toInt()>=97&&s[i].toInt()<=122){
        nLite++
        }
        }
        s = if (nBig>nLite) s.toUpperCase() else s.toLowerCase()
        print(s)
        }