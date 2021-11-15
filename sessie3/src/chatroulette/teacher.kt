package chatroulette

class Teacher(override val name: String): Person(name) {
    fun funFact() {
        println("My name is ${name} if by any chance you didn't know")
    }

    override fun talk() {
        funFact()
    }
}