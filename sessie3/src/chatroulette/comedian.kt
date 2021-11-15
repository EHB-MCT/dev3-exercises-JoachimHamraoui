package chatroulette

class Comedian(override val name: String): Person(name) {

    fun tellJoke() {
        println("Vee Vill Ask Zee Questions")
    }

    override fun talk() {
        tellJoke()
    }
}