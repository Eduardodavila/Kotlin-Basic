package Collections

fun main(args: Array<String>) {
    val array = arrayOf("Texas", "Iowa", "California")
    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    println(mixed[0])
    mixed[2] = "House"
    println(mixed[2])
    val str = "Kotlin"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allArrayMixed = array + states
    println(allArrayMixed.size)

    //val empaty: Boolean = numbers.isEmpty()
    if (states.contains("Kentucky")){
        println("It contains Kentucky")
    } else{
        println("It does not")
    }
    //println(empaty)




}