fun main(args: Array<String>) {
}
/* Create a named object that lets you check whether a given Int value is above a
threshold. Name the object Threshold and add a method isAboveThreshold(value:
Int)
 */

object Threshold {

    private const val threshold:Int = 21

    fun isAboveThreshold(number:Int):Boolean{
        return number>threshold
    }
}

/* Create a version of the Student class that uses a factory method
loadStudent(studentMap: Map<String, String>) to create a student with a first
and last name from a map such as mapOf("first_name" to "Neils", "last_name"
to "Bohr"). Default to using "First" and "Last" should the map not contain a first
name or last name
*/

class Student ( firstName:String, lastName:String){

    companion object{
        fun loadStudent(studentMap: Map<String,String>):Student{
            val firstName:String = studentMap["first_name"] ?: "First"
            val lastName: String = studentMap["last_name"] ?: "Last"
            return Student(firstName, lastName)
        }
    }

}
/*
Create an anonymous object that implements the following interface:
 */
interface ThresholdChecker {
    val lower: Int
    val upper: Int
    fun isLit(value: Int): Boolean
    fun tooQuiet(value: Int): Boolean
}

val anonymousObject = object : ThresholdChecker{
    override val lower: Int
        get() = TODO("Not yet implemented")
    override val upper: Int
        get() = TODO("Not yet implemented")

    override fun isLit(value: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun tooQuiet(value: Int): Boolean {
        TODO("Not yet implemented")
    }

}