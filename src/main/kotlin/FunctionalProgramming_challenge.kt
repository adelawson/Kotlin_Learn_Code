import java.util.*

fun main(){
    val firstRobot = Robot("Experimental Space Navigation Droid")
    val secondRobot = Robot("Extra-Terrestrial Air Safety Droid")
    val onBattleEnded: (Robot)-> Unit = {it.report("Won")}
    Battlefield.beginBattle(firstRobot, secondRobot,onBattleEnded)

    firstRobot yam secondRobot //infix func

}



class Robot(val name:String) {
    var strength: Int = 0
    private var health: Int = 100

    init {
        strength = Random().nextInt(100) + 10
        report("Created (strength $strength)")
    }

    infix fun yam(robot: Robot){
        robot.health -=10
    }

    fun report(message: String) {
        println("$name: \t$message")
    }

    // 1
    var isAlive: Boolean = true

    // 2
    fun attack(robot: Robot) {
// 3
        val damage = (strength * 0.1 + Random().nextInt(10)).toInt()
// 4
        robot.damage(damage.toInt())
    }

    fun damage(damage: Int) {
// 5
        val blocked = Random().nextBoolean()
        if (blocked) {
            report("Blocked attack")
            return
        }
// 6
        health -= damage
        report("Damage -$damage, health $health")
// 7
        if (health <= 0) {
            isAlive = false

        }

    }
}
object Battlefield {
    // 1
    fun beginBattle(firstRobot: Robot, secondRobot: Robot, onBattleEnded:(Robot)->Unit) {
// 2
        var winner: Robot? = null
// 3
        battle(firstRobot, secondRobot)
// 4
        winner = if (firstRobot.isAlive) firstRobot else secondRobot
        onBattleEnded(winner)
    }
    fun battle(firstRobot: Robot, secondRobot: Robot) {
// 5
        firstRobot.attack(secondRobot)
// 6
        if (secondRobot.isAlive.not()) {
            return
        }
// 7
        secondRobot.attack(firstRobot)
        if (firstRobot.isAlive.not()) {
            return
        }
// 8
        battle(firstRobot, secondRobot)
    }
}

fun functionReturn(int:Int, sample:String,function:(Int,Int)->Int ):()->Int{
    return ::intReturn
}
fun intReturn ():Int{
    return 23
}
