fun main() {
    val comrades = arrayOf("Rhys", "Cas", "Sam", "Birger", "Sean")
    for (comrade in comrades) {
        println(sayHello(comrade))
    }
}

fun sayHello(comrade: String) :String {
    return("Hello, $comrade")
}
