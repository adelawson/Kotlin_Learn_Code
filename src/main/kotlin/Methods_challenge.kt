import kotlin.math.PI

fun main(args: Array<String>) {
//    var date = SimpleDate(month = "December", day = 31)
//    date.advance()
//    date.month // December; should be January!
//    date.day // 32; should be 1!

    println(MyMath.isOdd(23))
    val yam:Int = 456
    fun Int.Companion.isEven(number: Int):Boolean{
        var state = false
        if (number%2==0){
            state = true
        }
        return state
    }


}

/*
1. Given the Circle class below:
import kotlin.math.PI
class Circle(var radius: Double = 0.0) {
val area: Double
get() {
return PI * radius * radius
}
}
Write a method that can change an instance’s area by a growth factor. For example if
you call circle.grow(factor = 3), the area of the instance will triple.
Hint: Make area a var and add a setter to it.
 */
class Circle(var radius: Double = 0.0) {
    var area: Double
        get() {
            return PI * radius * radius
        }
        set(value) {}

    fun grow(factor:Int){
        area*=factor
    }
}


class SimpleDate(var month:String, var day: Int = 0) {

    val months = arrayOf(
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    )

    fun advance() {
        day += 1
    }
}

object MyMath {
    fun isEven(number:Int):Boolean{
        var state = false
        if (number%2==0){
            state = true
        }
        return state
    }
    fun isOdd(number:Int):Boolean{
        var state = false
        if (number%2!=0){
            state = true
        }
        return state
    }
}

