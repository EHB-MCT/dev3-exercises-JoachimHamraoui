package chatroulette

    class Student(override val name: String): Person(name) {
        fun gossip() {
            println("${name}: I played Smash Bros. with my friends yesterday!")
        }

        override fun talk() {
            gossip()
        }
    }