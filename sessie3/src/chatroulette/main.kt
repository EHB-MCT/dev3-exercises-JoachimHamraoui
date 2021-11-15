package chatroulette

fun main() {

    val listOfPeople = arrayOf(Student("Rhys"), Teacher("Mike Derycke"), Comedian("Joachim"))

    val chatPartner = listOfPeople.random();

    chatPartner.introduce()
    chatPartner.talk();
}