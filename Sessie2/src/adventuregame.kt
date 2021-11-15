import kotlin.random.Random

val optionsChal1 = listOf("Xigbar", "Luxord", "Xemnas");
val optionsChal2 = listOf("High", "Low");
fun main() {
    println("Welcome to The World That Never Was, your journey with the Keyblade has led you to the domain of Organization XIII");
    IntroGame();
    Challenge1(optionsChal1);
}

fun IntroGame() {
    val userChoice: String?
    println("Do you wish to stop here or to continue?");
    userChoice = readLine();
    if (userChoice == "Continue") {
        println("You have chosen to go further on your quest. There is no point of return.");
    } else if (userChoice == "Stop here") {
        println("You're probably going to do some sidequests")
    }

}

fun Challenge1(optionsChal1: List<String>): String? {
    val userChoice: String?
    println("An member of the Organization has appeared, but he is hooded.. Who could it be?")
    userChoice = readLine();
    when (userChoice) {
        optionsChal1[0] -> loseTheGame()
        optionsChal1[1] -> {
            println("Yes, that's the right answer!")
            Challenge2(optionsChal2)
        }
        optionsChal1[2] -> loseTheGame()
    }
    return userChoice;
};

fun Challenge2(optionsChal2: List<String>): String? {
    val userChoice: String?
    val randomValue = (1..6).random();
    println("Luxord is the gambler of the Organization, he throws his dice. What will he gamble on?")
    println("Luxord: 'I'll throw my dice, and you have to guess whether it's a low toss, or a high one. Prepare, Sora!'")
    println(randomValue)
    userChoice = readLine()

    when(userChoice) {
        optionsChal2[0] -> if (randomValue >3) {
            println("Correct, you won.")
            Challenge3()
        }  else loseTheGame()
        optionsChal2[1] -> if (randomValue <4) {
            println("Correct, you won.")
            Challenge3()
        } else loseTheGame()
    }
    return userChoice


}

fun Challenge3() {
    println("You've beaten my first challenge, Sora.")
    println("But to defeat me, you'll have to bet something far greater than your power.")
    println("Your Friends!")
    println("*Your friends have been sucked into playing cards*")
    println("Now, guess in which kind of card your friends reside in?")
    println("(1) Spade")
    println("(2) Club")
    println("(3) Heart")
    println("(4) Diamond")

    var userChoice: Int
    do {
        println("Now choose")
        userChoice = readLine()?.toInt() ?: 0
    } while (!setOf<Int>(1, 2, 3, 4).contains(userChoice))

    when (userChoice) {
        1 -> {
            println("Shall I reveal the results?")
            println("Oopsie daisy, looks like you lost");
            println("You've taken considerable damage but have not died yet")
            println("Go back to the previous challenge")
            Challenge2(optionsChal2)
        }
        2 -> {
            println("Shall I reveal the results?")
            println("Oopsie daisy, looks like you lost");
            println("*Luxord attacks with a furry of cards*")
            println("Disappear, Sora!!!!")
            loseTheGame()
        }
        3 -> {
            println("Shall I reveal the results?")
            println("Fortunately, you were right");
            println("*You slash Luxord in half and win the battle*")
            Challenge4()
        }

        4 -> {
            println("Shall I reveal the results?")
            println("Oopsie daisy, looks like you lost");
            println("*Luxord attacks with a furry of cards*")
            println("Disappear, Sora!!!!")
            loseTheGame()
        }
    }

}

fun Challenge4() {
    println("ayoo this is challenge 4")
}



fun loseTheGame(){
    println("You died! End of The Game!");
    endTheGame()
}

fun endTheGame() {
    println("The Game has Ended");
}