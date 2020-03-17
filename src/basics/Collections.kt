package basics

fun main(args: Array<String>) {
    // immutable case
    val targaryens = listOf("Aegon", "Viserys", "Lyanna", "Daenerys", "Jon Snow")
    println(targaryens)
    println(targaryens.sorted())
    println(targaryens.last())
    println(targaryens.contains("rhaegar"))

    // mutable case
    val starks = arrayListOf("Ned", "Robb", "Bran", "Sansa", "Catelyn")
    println(starks)
    starks.add("Arya")
    starks.add("Rickon")
    starks.add(0, "Lyanna")
    println(starks)
    println(starks.size)
    //oh no Lyanna was kidnapped by Rhaegar
    starks.remove("Lyanna")
    println(starks)

    // immutable case
    val  WesterosCastles = mapOf("stark" to "Winterfell", "tyrell" to "Highgarden")

    println(WesterosCastles)
    println(WesterosCastles["tyrell"])
    println(WesterosCastles.get("stark"))
    println(WesterosCastles.getOrDefault("targaryen", "Dragonstone"))
    println(WesterosCastles.keys)
    println(WesterosCastles.values)

    // mutable case

    val castlesByFamily = hashMapOf("stark" to "Winterfell", "tyrell" to "Highgarden")
    castlesByFamily.put("tully", "Riverrun")
    castlesByFamily.put("lannister", "Casterly Rock")

    println(castlesByFamily)
    //oh noooo, Winterfell was taken by the others
    println(castlesByFamily.remove("stark"))

    println(castlesByFamily)
    println(castlesByFamily.isEmpty())

}
