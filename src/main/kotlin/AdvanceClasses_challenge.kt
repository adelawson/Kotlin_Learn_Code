import java.text.FieldPosition

fun main(args: Array<String>){
    val h = C()
    val j = h as A
    val a = A()
    val b = a as C
}

open class A{
    init {
        println("I am a class A object")
    }
}

open class B: A(){
    init {
        println("I am a class B object")
    }
}

class C:B(){
    init {
        println("I am a class C object")
    }
}

class StudentAthlete(rank:Int, name:String){
    class StudentBaseballPlayer(position: Int, number:Int, battingAverage:Int){
    }
}

sealed class Resource{
   class Success(string: String):Resource()
    class Error(string: String):Resource()
}
