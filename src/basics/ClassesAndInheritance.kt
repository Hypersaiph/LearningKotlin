package basics

fun main(args: Array<String>) {
    val car = Car("Toyota", "Avalon", "Black")
    println(car.make)
    println(car.model)

}

class Vehicle constructor(make: String, model: String) {
    fun accelerate() {
        println("vroom vroom")
    }
    fun park() {
        println("parking the vehicle")
    }
    fun brake(){
        println("STOP")
    }
}

class Car constructor(make: String, model: String, color: String) {
    val make = make
    val model = model
    val color = color

    fun accelerate() {
        println("vroom vroom")
    }

    fun details() {
        println("This is a $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("taking the horses to the rodeo")
    }

    fun details() {
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }

}