import javax.naming.Name

fun main() {
    //
    var num1 = 30
    var num2 =50
    var sum = num1 + num2
    println(sum)
    //
    var num3 = 60
    var num4 = 20
    var difference = num3 - num4
    println(difference)
    //
    var num5 = 54
    var num6 = 2
    var multiplication = num5*num6
    println(multiplication)
    //
    var num7 = 120
    var num8 = 40
    var division = num7/num8
    println(division)
    //
    var num9 = 47
    var num10 =12
    var remainder =num9%num10
    println(remainder)
    //
    var age = 19
    ++age
    print(age)
    //
    var weight = 52
    --weight
    print(weight)
    //
    val a = 325
    val b = 432
    print(a>b)
    ////////
    add()
    printName()
    modulus()
    multiply(2333,21)
    multiply(127,2)
    multiply(2,4)
}
    //////////////
    fun add(){
        val c = 32
        var d = 45
        var sum = c + d
        println(sum)
    }
    fun printName(){
        println("Mary Juma")
    }
    fun modulus(){
        var num1 = 45
        var num2 = 13
        var modulus = num1 % num2
        println(modulus)
    }
fun multiply (num11:Int,num12:Int){
    var product = num11*num12
    println(product)


}








