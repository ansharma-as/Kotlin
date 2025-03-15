fun main(){
    var word : String = "Kotlin"
    for(letter in word){
        println("Letter is: $letter")
    }


        val a = "Ansh"

        for (i in a.indices) { // Uses indices directly
            println("Character at index $i: ${a[i]}")
        }

        val b: String = "Ansh"

        for (i in 0 until b.length) { // Corrected loop declaration
            println("Character at index  $i: ${b[i]}")
        }



}