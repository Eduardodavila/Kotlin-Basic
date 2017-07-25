package functions

import java.util.*

fun helloWorld(){
    println("Hello World!")
}
fun printWhitSpaces(text: String){
    for (char in text){
        print(char + " ")
    }
   // println()
}
fun getCurrentDate(): Date{
    return Date()
}
fun max(a: Int, b: Int): Int{
    if (a >= b){
        return  a
    } else{
        return b
    }
}

fun main(args: Array<String>) {
    helloWorld()
    printWhitSpaces("Kotlin\n")
    println(getCurrentDate())
    println(max(5, 1))
}