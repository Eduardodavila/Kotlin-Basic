package functions

fun helloWorld(){
    println("Hello World!")
}
fun printWhitSpaces(text: String){
    for (char in text){
        print(char + " ")
    }
   // println()
}

fun main(args: Array<String>) {
    helloWorld()
    printWhitSpaces("Kotlin")
}