import kotlin.properties.Delegates

fun main(args: Array<String>) {
//    println("Hello, Kotlin!")
//    println(calculateFarenheit(45.0))
//    val y = 23
//    val x = 30
//    val z = (y+x).toDouble()/2
//
//    val fix : String? = null
//    println("i love eggs and $fix")
//    val egg = arrayOf<Int>(1,2,3,4)
//    println(egg)
//    egg.plus(6)
//
//    println(egg)
//
//
//    val celcius = Pair(10,20)
//    val (f,g) = celcius
//
//    val array = arrayOf("beans","rice", "yam", "fish")
//    val array2 = arrayOf(1,2,4,5)
//
//    for (i in array){
//        println(i)
//    }
//    var imposters = (0..100).map {
//        Person(firstName = "John", lastName = "Appleseed")
//    }
//    println(imposters)
//
//    val yam = Person("adesayo", "lawson")
//    yam.firstName = "yam"

//    val ex = Movielist("marvel movies")
//    ex.addMovie("black widow")
//    ex.addMovie("Avengers")
//    println(ex.movielist)
//    ex.print()
//
//    val yam = Person.newPerson("yam","eggs")
//
//
//    println(Threshold.isAboveThreshold(34))
//
//    val test = object :ThresholdChecker{
//        override val lower: Int = 10
//        override val upper: Int = 300
//
//        override fun isLit(value: Int): Boolean {
//            return value>lower
//        }
//
//        override fun tooQuiet(value: Int): Boolean {
//            return value<upper
//        }
//
//    }
//    funnyman.testEgg()
//
//    println(test.isLit(21))

//    val coordinates = Pair(2,3)
//    val (row,column) = coordinates
//    println(row)
//
//    val junit = Triple(10,34,56)

    val a = 4
    val b: Short = 100
    val c: Byte = 12

    val d = (a+b)-c
    println(d)
//
//    val currency = Currency.Crypto()
//    println(currency.name)
//
//    currency.amount= .27541F
//    println(currency.dollarConversion())
//
//    val beans = listOf<String>("two", "three", "four", "five")
//
//
//    val no = calculateMonth(month = "february", 400)
//    println(no)
//
//    var count = 0
//    var power = 2
//    while (count<10){
//        println(power)
//        power *=2
//        count +=1
//
//    }
//    val h = factorial(10)
//    println(h)
//
//    val range = 10 downTo 0
//
//    val u = isPrime(-1)
//
//    println(u)

//    val test: Int = divideIfWhole(8,2) ?: 0
//
//    println(test)
//
//
//    var array5 = arrayOf(1, 2, 3)
//    array5[0] = array5[1]
//    array5 += 6
//
//    for (i in array5){
//        println(i)
//    }

//    val day = listOf(1,2,3,4,5,6,6,6,7)
//    val yam = removeOne(6,day)
//    val rec = removeAll(6,day)
//    val gbogbs = invertList(day)
//    val bam = day.slice((day.size-1) downTo 0)
//    println(yam)
//    println(rec)
//    println(gbogbs)
//    println(bam)
//
//    val map4 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
//    val map5 = mutableMapOf("NY" to "New York", "CA" to "California")
//    map5["WA"] = "washington"
//
//    for (i in "yam"){
//        println(i)
//    }
//
//    val x : Int? = null
//    val y : Int = x!! *2

    val task = {time: Int ->
        for (i in (1..time)){
            println("Kotlin is great")
        }
    }

    repeatTask(10,task)

}


fun fibonacci(number: Int):Int{
    return 1
}

fun invertList(list: List<Int>):List<Int>{
    val range = (list.size-1) downTo 0
    val newList = mutableListOf<Int>()
    for(i in range){
        newList.add(list[i])
    }
    return newList
}

fun removeOne(item:Int, list: List<Int>):List<Int>{
    val yam = mutableListOf<Int>()
    for(i in list){
        yam.add(i)
    }
    yam.remove(item)
    return yam
}

fun removeAll(item:Int, list: List<Int>):List<Int>{
    val yam = mutableListOf<Int>()
    for(i in list){
        if (i!=item){
            yam.add(i)
        }
    }
    return yam
}

fun divideIfWhole(number: Int,divisor: Int):Int?{
    var times:Int? = 0
    var count = 0
    var remainder = number
    if (number%divisor != 0 ){
        times = null
    } else{
        while (remainder%divisor==0){
            count +=1
            remainder/=divisor
        }
        times = count
    }


    return times
}

fun factorial(number: Int):Int{
    var n = number
    var b = number
    while (n>1){
        n-=1
        b*=n
    }
    return b
}

fun calculateMonth(month:String,year: Int):Int{
    var noOfMonths = 0
    if (month == "february"){
        if ( (year%4 ==0 || year%400 == 0) && year%100!=0){
            noOfMonths = 29
            println("it is a leap year")
        } else{
            noOfMonths = 28
        }
    }
    return noOfMonths
}

fun isNumberDivisible(number: Int, divisor: Int): Boolean{
    var div = false
    if (number%divisor == 0 ){
        div = true
    }
    return div
}

fun isPrime(number: Int):Boolean{

    val range = 2 until (number-1)
    var prime = true
    if (number<=0){prime = false}
    for (i in range){
        if (isNumberDivisible(number,i)){
            println("not prime")
            prime = false
            break
        }
    }
    return prime
}

fun calculateFarenheit( num: Double):Double{
    val celcius = ((num -32.0)/180.0)* 100.0
    return celcius
}

class Person private constructor(var firstName:String, var lastName:String){
    val fullname
        get() = "$firstName $lastName "

    companion object sample {
        var test = 10
        fun newPerson(firstName: String,lastName: String):Person{
            return Person(firstName, lastName)
        }
    }

}

class funnyman (var name: String, var email:String){

    lateinit var tea: String

    var funny:String
        get() = "$name+$email"
        set(value) {
             email = value
        }
    companion object{
        var yam = 34

        fun testEgg (){
            println("Test egg")
        }
    }

    fun testYam(){
        println("test yam")
    }

    var observable by Delegates.observable(25){
        _,new,old->
        if (new>old){
            yam = new
        }
    }


    var limiter by Delegates.vetoable(12){
            _, _, new ->
        if (new<12){
            println("why is this not working")
            true
        }else{
            false
        }
    }


}


fun repeatTask(times:Int, task:(Int)-> Unit ){
    task(times)

}

enum class SampleEnum{
    Monday, Tuesday,Wednesday,Thursday,Friday;
}

sealed class Currency {
    abstract val valueInDollars: Float

    class Dollar : Currency() {
        override val valueInDollars = 1.0F
    }

    class Euro : Currency() {
        override val valueInDollars = 1.25F
    }

    class Crypto : Currency() {
        override val valueInDollars = 2534.92F
    }

    val name: String
        get() = when (this) {
            is Euro -> "Euro"
            is Dollar -> "Dollar"
            is Crypto -> "Nerd Coin"
        }
    var amount: Float = 0.0F
    fun dollarConversion(): Float {
        return amount * valueInDollars
    }
}

fun <T>List<T>.second():String{
    return this[1].toString()
}


