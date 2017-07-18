package loops
fun main(args: Array<String>){
    var sum = 1
    for(i in 1..10){
        sum = sum + i

    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Pyton")
    for (elements in list){
        println(elements)
    }
    for((index, value) in list.withIndex()){
        println("Elements at $index is $value")
    }
}