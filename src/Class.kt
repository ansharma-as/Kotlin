fun main(){
    val person1 = Person1("Ansh" , 20)
}

class Person1(fname: String , personAge: Int){
    val firstName : String
    var age: Int

    init {
        firstName=fname.capitalize()
        age= personAge

        println("Name: $firstName")
        println("Age: $age")

    }
}