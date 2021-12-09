fun main() {
    println("${DaysOfTheWeek.day(0)}")


}

enum class DaysOfTheWeek{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    companion object{
        lateinit var may:DaysOfTheWeek
        lateinit var int: DaysOfTheWeek
        fun day(index:Int):DaysOfTheWeek{
            if (index>0){
                may = DaysOfTheWeek.values()[index-1]
            }
            else{
                println("enter a value greater than 0")
            }
            return may
        }

        fun returnIndex (string: String){

        }
    }
    fun DaysTillWeekend(day:DaysOfTheWeek):Int{
        return day.ordinal - (DaysOfTheWeek.values().size)
    }
}
