fun main(args: Array<String>){
    val maria = Girl()
    maria.actualAge = 13
    maria.age = 27
    println("Maria Actual age: = ${maria.actualAge}")
    println("Maria pretended age: = ${maria.age}")


    val angela = Girl()
    angela.actualAge = 12
    angela.age = 32
    println("Angela Actual age: = ${angela.actualAge}")
    println("Angela pretended age:  = ${angela.age}")
}

class Girl {
    var age: Int = 0
        get() = field
        set(value){
            field = if(value < 18)
                18
            else if(value >= 18 && value <=30 )
                value
            else
                value-3

        }
    var actualAge = 0
}
