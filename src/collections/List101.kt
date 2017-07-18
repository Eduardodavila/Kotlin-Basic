package collections

fun main(args: Array<String>) {
    val arrayList = arrayListOf("Patrick", "Michel", "Sarah")
    val list = arrayListOf("Peter")
    println(arrayList[0])
    println(arrayList + list)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Sarah"))
    arrayList.add("Josh")
    arrayList.add(0,"Jack")
    println(arrayList)
    val subList = arrayList.subList(1, toIndex = 4)
    println(subList)
}
