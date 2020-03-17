package basics

fun main(args: Array<String>) {
    val name: String = "Jonnyb"

    var nullableName: String? = "Do I really exists?"
    nullableName = null
    //compiler error
    //println(nullableName.length)

    //Null check
    var length = 0
    if(nullableName != null){
        length = nullableName.length
    } else {
        length = -1
    }

    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    // Second method Safe Call Operator ?
    //print this if it is not null else print null
    println(nullableName?.length)

    // Third method is Elvis Operator
    //nullableName = "Elvis :V"
    var len = nullableName?.length ?: -1
    println(len)
    println(nullableName?.length ?: "no one knows mee...")

    // Last one !! double exclamation exception
    println(nullableName!!.length)
}