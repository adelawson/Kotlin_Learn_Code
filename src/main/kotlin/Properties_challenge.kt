import kotlin.properties.Delegates

fun main(args: Array<String>) {

    println("yam")

    val may = FuelTank()
    may.level = 0.3
    println(may.lowFuel)
    may.level = 0.02
    println(may.lowFuel)
}

/*
Rewrite the IceCream class below to use default values and lazy initialization:
class IceCream {
val name: String
val ingredients: ArrayList<String>
}
1. Use a default value for the name property.
2. Lazily initialize the ingredients list.
 */

class IceCream (name:String= "vanilla"){
    val ingredients:ArrayList<String> by lazy {
        arrayListOf("vanilla Flavoring", "milk", "sumn")
    }
}

/*

At the beginning of the chapter, you saw a Car class. Dive into the inner workings of the
car and rewrite the FuelTank class below with delegated property observer
functionality:
class FuelTank {
var level = 0.0 // decimal percentage between 0 and 1
}
1. Add a lowFuel property of Boolean type to the class.
2. Flip the lowFuel Boolean when the level drops below 10%.
3. Ensure that when the tank fills back up, the lowFuel warning will turn off.
4. Add a FuelTank property to Car and fill the tank. Then drive around for awhile.
 */

class FuelTank {
    var lowFuel: Boolean = false
    var level:Double by Delegates.observable(0.0){
        _,old,new->
        if (new<0.1){
            lowFuel = true
        }
        if(new>0.1){
            lowFuel = false
        }
    }

}