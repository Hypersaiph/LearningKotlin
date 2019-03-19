package basics

fun main(args: Array<String>) {

    //  \r: everything after this is left off
    //  \b: back space
    //  \n: new line
    //  \t: tabs everything over
    // /$: dollar sign :v
    val str = "May the force be with you."
    println(str)
    val str1 = "My dad said the funniest thing, he  said \"A joke\""
    println(str1)

    // Multi line string
    // use pipe: | to specify ehre it will trim or use any other symbol and pass the argument to trimMargin()
    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMMMMMM""".trimMargin()
    println(rawCrawl)
    /*for (char in str) {
        println(char)
    }*/

    // if strings are equals
    val contentEquals = str.contentEquals("May the force be w*th you.")
    println(contentEquals)

    // if string contains
    val contains = str.contains("Force", false) //false: does not ignore character case
    println(contains)

    //change char case
    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase)
    println(lowercase)

    //sub-sequence
    val subsequence = str.subSequence(4, 13)
    println(subsequence)


    //templating output
    println("May $subsequence be with you!: ${str.length}")

}