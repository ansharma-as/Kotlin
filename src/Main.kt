
import kotlin.math.pow
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {

//    println("Hello, World of Andorid !")
//    Variables()
    Operators()
}

fun Variables(){
//    print("My name is Ansh !")

    var name: String = "Ansh"
    name="Sharma"
    println(name)

    val  naam = "ansh"
    print(naam)
}

fun Operators(){
    var a = 10
    var b = 8

    println("adding: " + (a+b))
    println("subtracting: " + (a-b))
    println("Multiplication: " + (a*b))
    println("Division: " + (a/b))
//    println("Power: "+a**b)
//    println("Checking: " + a>b)
//    println("checking: "+ a<b)


    //post increment operator
    println(++a)
    println(--a)

    //pre Increment operator
    println(a++)
    println(a--)
    print(a)



}
