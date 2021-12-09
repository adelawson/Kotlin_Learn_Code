import sun.security.util.Length

fun main(){

}

interface PetShop {
    val dog: String
    val cat: String
    val fish: String

}

interface Area{
    val area: Double
}

class Square(length: Int) :Area {
    val l = length
    override val area: Double
        get() = (l*l).toDouble()

}