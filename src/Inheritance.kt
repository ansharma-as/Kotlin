open class person(age: Int , name: String){
    init {
        println("my name is: $name.")
        println("my age is: $age.")
    }
}

class Teacher(age: Int ,  name: String) : person(age , name) {
    fun teach(){
        println("I am a teaching i like teaching.")
    }
}

class Footballer(age: Int ,  name: String) : person(age , name){
    fun play(){
        println(" I am a player i like playing")
    }
}

fun main(args: Array<String>){
    val t1= Teacher(25, "Sumit")
    t1.teach()

    val p1= Footballer(18, "Ansh")
    p1.play()

}

//sabse pehle base class isliye print huyi kyunki
// whenwver the object is created init block ececute first