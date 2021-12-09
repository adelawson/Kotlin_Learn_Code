fun main(){

    val ship = Spaceship()
    Spaceport.investigateSpace(ship)

}
class Spaceship(){
    var isConnectionAvailable: Boolean = false
    var isEngineInOrder: Boolean = false
    var isInSpace: Boolean = false
    var fuel: Int = 0
    fun launch() {
        if (fuel < 5) {
            throw FuelException()
        }
        if (!isEngineInOrder) {
            throw Exception("The engine is broken. Can't take off")
        }
        if (!isConnectionAvailable) {
            throw Exception("No connection with Earth. Can't take off")
        }
        sendMessageToEarth("Trying to launch...")
        fuel -= 5
        sendMessageToEarth("I'm in space!")
        sendMessageToEarth("I've found some extraterrestrials")
        isInSpace = true
    }
    fun sendMessageToEarth(message: String) {
        println("Spacecraft to Earth: $message")
    }
}

object Spaceport {
    fun investigateSpace(ship:Spaceship){

        try {
            ship.launch()
        }catch (exception: Exception){
            ship.sendMessageToEarth(exception.localizedMessage)
        }finally {
            println("ati lo ati de")
        }
    }
}

class FuelException : Exception("Out of Petrol Guy")