fun main(){
    val array1= arrayOf(1,2,3,4,5,6)
    val array2 = arrayOf<Long>(11,12,13,14,14,16)

    array1.set(0,5)
    array1[2]=6

    array2.set(0,22)
    array2[2]=58

    for(i in array1){
        print("$i ")
    }
    println()
    for(i in array2){
        print("$i ")
    }
    println()

    println(array1.get(0))
    println(array1[2])
    println()
    println(array2.get(2))
    println(array2[1])
}