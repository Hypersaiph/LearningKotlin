package basics

fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }
    printMessage("Hello World!")

    val sumA = { x: Int, y: Int -> x + y }

    printMessage(sumA(60, 9).toString())

    val sumB: (Int, Int) -> Int = {x,y -> x + y}

    printMessage(sumB(400, 20).toString())

    fun downloadData(url: String, completion: ()-> Unit) {//Unit is the equivalent of void in Java
        //call REST API
        // we got back data
        // there were no network errors
        completion()
    }
    downloadData("youtube.com") {
        println("The code in this block, will only run" +
                "after the completion()")
    }

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //send a download request
        //we got bak car data
        val car = Car("Tesla", "X", "Black")
        completion(car)
    }

    downloadCarData("tesla.com") {
        println(it.details())
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //we make a web request
        // we get the result back
        val webRequestSuccess = true
        if(webRequestSuccess) {
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, true)
        }
    }

    downloadTruckData("tesla.com/get-truck") { truck, success ->
        if(success == true) {
            truck?.tow()
        } else {
            printMessage("something went wrong!")
        }
    }
}