package conditionals

fun main(args: Array<String>) {
    val x = 9
    when (x){
        0 -> println("X is= " + x)
        10 * 10 -> println("X is 3*12= " + x)
        "Hey there".length -> println("X is 'Hey there'= " + "Hey there".length)
        in 1..10 -> println("X is between 1 and 10")
        in 11..20 -> println()
        !in 1..9 -> println("X is not between 1 to 10")

    }
}