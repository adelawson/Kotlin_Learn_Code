fun main(args: Array<String>) {

}

class Movielist (var name:String, var movielist:MutableList<String> = mutableListOf()  ){
    fun addMovie(movie:String){
        movielist.add(movie)
    }
    fun print (){
        for(i in movielist){
            println(i)
        }
    }
}

class User (var name: String, var movielist: Movielist){
    val map = mutableMapOf<String,Movielist>()
    fun addList(name: String,movielist: Movielist){
        map.put(name,movielist)
    }
    fun list(name: String):Movielist?{
        val movielist:Movielist? = map[name]
        return movielist
    }
}

data class TShirt ( var size: Int, var color:String, var price:Int, var image:String? = null ){}