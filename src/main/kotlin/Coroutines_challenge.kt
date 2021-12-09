import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main()= runBlocking{
    launch(Dispatchers.Default){
        (0..10).forEach {
            println("$it is on the ${Thread.currentThread().name}")
        }
    }
    (0..10).forEach {
        println("$it is on the ${Thread.currentThread().name}")}
}