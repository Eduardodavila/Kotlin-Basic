package loops

fun main(args: Array<String>) {
    for (c in "python") {
        if (c == 'o') {
            break

        }
        print(c)
    }
    println("\n")
    val list = listOf("Book", "Table", "Laptop")
        for(str in list){
            if(!str.contains('o')){
                print("\t")
                continue

        }
            print(str)
    }
}