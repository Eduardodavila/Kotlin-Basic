package conditionals

fun main(args: Array<String>) {
    val mode: Int = 2

    val result = when (mode) {
        1 -> println("The mode is Lazy")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy")
        }
        3 -> println("The mode is super-productive")
        else -> println("I don't know that mode.")
    }
    if (mode < 1 || mode > 3){
        println("NO entry")
    }
}