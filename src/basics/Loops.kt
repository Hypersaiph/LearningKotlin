package basics

fun main(args: Array<String>) {
    val starks = arrayListOf("Ned", "Robb", "Bran", "Sansa", "Catelyn")
    val castlesByFamily = hashMapOf("stark" to "Winterfell", "tyrell" to "Highgarden", "tully" to "Riverrun", "lannister" to "Casterly Rock")

    for (name in starks) {
        println("$name Stark")
    }

    for ((key, value) in castlesByFamily) {
        println("$value belongs to the $key family")
    }
}