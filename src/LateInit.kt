fun main(){
    var obj1 = Person("Ansh" , 21)
    obj1.canVote(22)
}

class Person(var name: String ,  var age:Int){
   lateinit var profession : String

    fun canVote(age: Int){
        if(age<18){
            println("you cn not vote")
        }
        else{
            println("you can vote")
        }
    }
}
