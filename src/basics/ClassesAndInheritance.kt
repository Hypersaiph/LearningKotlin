package basics

fun main(args: Array<String>) {
    val tesla = Car("Toyota", "Avalon", "Black")
    tesla.accelerate()

    val cyberTruck = Truck("Tesla", "Cybertruck", 10000)
    cyberTruck.details()
}

open class Vehicle constructor(make: String, model: String) {
    open fun accelerate() {
        println("vroom vroom")
    }
    fun park() {
        println("parking the vehicle")
    }
    fun brake(){
        println("STOP")
    }
}

class Car constructor(make: String, model: String, color: String): Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!!")    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int): Vehicle(make, model) {
    fun tow() {
        println("taking the horses to the rodeo")
    }

    fun details() {
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }
}