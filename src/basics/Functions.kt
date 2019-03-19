package basics

fun main(args: Array<String>) {
    fun forceChoke() {
        println("You've failed me for the last time Admiral... ")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("LEEEEEEEEEEEEEEEEEEEEEEEEEEEEROOOOOOOY JEEEEEEEEEEEEEEEEEENKIIIINS!!")

    //Specify type of return value of the function
    fun niceGuyCalculator(incels: Int, soyboys: Int, onionMans: Int): Int {
        val niceGuys = incels + soyboys - onionMans
        return return niceGuys
    }

    val niceGuys = niceGuyCalculator(3, 4, 2)
    println("The quantity of nice guys is: $niceGuys")
    println("Nice guy count: ${niceGuyCalculator(6, 4, 6)}")

    fun vadedrIsFeeling (mood: String = "angry") {
        println(mood)
    }
    vadedrIsFeeling("AFRAID")
}