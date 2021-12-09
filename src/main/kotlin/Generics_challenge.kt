fun main(){
    val itemsToMove = listOf<CheapThing>(
        CheapThing("shoes"),CheapThing("shirt"),
        CheapThing("watch")
    )
    val breakableItems = listOf<BreakableThing>(BreakableThing("mug")
        ,BreakableThing("clock"))
    val mover= Mover(itemsToMove)
    mover.moveEverythingToTruck()
    mover.moveEverythingIntoNewPlace()
    mover.finishMove()

    val mover2 = Mover(breakableItems)
    println("yam")
}
interface Container<T> {
    // 2
    fun canAddAnotherItem(): Boolean
    fun addItem(item: T)
    // 3
    fun canRemoveAnotherItem(): Boolean
    fun removeItem(): T
    // 4
    fun getAnother(): Container<T>
    // 5
    fun contents(): List<T>
}
interface Checkable{
    fun checkIsOK():Boolean
}
fun <T>List<T>.toBulletedList():String{
    val separator = "\n - "
    return this.map { "$it" }.joinToString(separator, prefix = separator,
        postfix = "\n")
}
class CheapThing(private val name:String) : Checkable{
    override fun checkIsOK(): Boolean = true

    override fun toString(): String {
        return name
    }
}
class BreakableThing(val name: String, var isBroken:Boolean = false):Checkable{
    fun smash(){
        isBroken=true
    }

    override fun checkIsOK(): Boolean {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return name
    }
}
class Mover<T:Checkable>(thingsToMove:List<T>, val truckHeightInInches:Int = 144){
    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingsInTruck = mutableListOf<T>()
    private var thingsInNewPlace = mutableListOf<T>()
    private var thingsWhichFailedCheck = mutableListOf<T>()
    // 4
    init {
        thingsLeftInOldPlace.addAll(thingsToMove)
    }

    // 5
    fun moveEverythingToTruck() {
        while (thingsLeftInOldPlace.count() > 0) {
            val item = thingsLeftInOldPlace.removeAt(0)
            if (item.checkIsOK()) {
                thingsInTruck.add(item)
                println("Moved your $item to the truck!")
            } else {
                thingsWhichFailedCheck.add(item)
                println("Could not move your $item to the truck :[")
            }
        }
    }
    // 6
    fun moveEverythingIntoNewPlace() {
        while (thingsInTruck.count() > 0) {
            val item = thingsInTruck.removeAt(0)
            if (item.checkIsOK()) {
                thingsInNewPlace.add(item)
                println("Moved your $item into your new place!")
            } else {
                thingsWhichFailedCheck.add(item)
                println("Could not move your $item into your new place :[")
            }
        }
    }
    // 7
    fun finishMove() {
        println("OK, we're done! We were able to move your:${thingsInNewPlace.toBulletedList()}")
            if (!thingsWhichFailedCheck.isEmpty()) {
                println("But we need to talk about your:${thingsWhichFailedCheck.toBulletedList()}")
            }
    }


}