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
        optionsChal2[0] -> if (randomValue >3) println("Correct, you won.") else loseTheGame()
        optionsChal2[1] -> if (randomValue <4) println("Correct, you won.") else loseTheGame()
    }
    return userChoice


}

fun loseTheGame(){
    println("You died! End of The Game!");
    endTheGame()
}

fun endTheGame() {
    println("The Game has Ended");
}