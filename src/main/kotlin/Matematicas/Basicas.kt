package Matematicas

class Basicas(_num1 : Int, _num2 : Int) {
    var num1 = _num1
    var num2 = _num2

    fun suma() : Int {
        return num1 + num2
    }

    fun resta() : Int {
        return num1 - num2
    }

    fun multi() : Int {
        return num1 * num2
    }

    fun division() : Double {
        return num1.toDouble()/ num2.toDouble()
    }

}