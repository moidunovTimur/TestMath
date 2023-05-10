package com.example.remit

class Math {

    fun add(a: String, b: String): String {
        var result = ""

        if ((!isNumeric(a) || !isNumeric(b)) && !(a.contains(".") || b.contains("."))) {
            result = "нельзя вводить буквы"
        }else if(a.isEmpty() || b.isEmpty()){
            result = "вы не заполнили поле"
        } else {
            result = (a.toBigDecimal() + b.toBigDecimal()).toString()
        }
        return result
    }

    fun divide(a: String,b: String):String{
        var result = ""
        if (b.contains("0")){
           result = "На Ноль делить нельзя"
        }else {
            result = (a.toBigDecimal() / b.toBigDecimal()).toString()
        }
        return result
    }

    fun isNumeric(str: String) = str.all { it in '0'..'9' }
}

