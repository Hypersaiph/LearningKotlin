package basics

fun main(args: Array<String>) {
    val a = 2
    val b = 3

    //equality
    if(a == b) {
        println("A does in fact equal B")
    }

    if (a != b) {
        println("A does not equal B")
    }

    val accountBalance = 100
    val price = 150

    if(accountBalance >= price) {
        println("You can buy this :v")
    } else {
        println("SORRY DUDE, YOU BROKE MAN...")
    }

    val degrees = 60

    if (degrees >= 70) {
        println("Nice weather!")
    } else if (degrees < 70 && degrees >= 50) {
        print("Grab a weather!")
    } else {
        println("HOLY MOLY DUDE, ITS COLD!")
    }

    val isHungry = false
    val isBored = true

    if(isHungry || isBored) {
        println("Lets get KETO PIZZAAAA!")
    }

    val x = 1
    //WHEN STATEMENT BRO
    when (x) {//x could be
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal to 1 or 2")
    }

    fun vaderIsFeeling(mood: String = "angry") {
        if (mood == "angry"){
            println("run for the hills, Vader is $mood!")
        } else {
            println("what ever you do, don't make him angry plox!")
        }
    }
    vaderIsFeeling("blue")
}