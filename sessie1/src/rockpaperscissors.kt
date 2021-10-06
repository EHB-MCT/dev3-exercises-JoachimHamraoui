fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors");
    val computerChoice = options.random();
    val userChoice = getUserChoice(options)

    println("Computer picked $computerChoice");
    println("User picked $userChoice");
    determineWinner(computerChoice, userChoice);
}

fun getUserChoice(options: Array<String>): String? {
    var userChoice: String?
    do {
        println("Make your choice: Rock - Paper - Scissors");
        userChoice = readLine();
    } while (!options.contains(userChoice))
    return userChoice
}

fun determineWinner(computerChoice: String, userChoice: String?) {

    if (computerChoice == userChoice) {
        println("It's a Draw")
        return
    }

    val winMessage = "You've won"
    val loseMessage = "You've lost"

    when (computerChoice) {
        "Rock" -> if (userChoice == "Paper") println(winMessage) else println(loseMessage)
        "Paper" -> if (userChoice == "Scissors") println(winMessage) else println(loseMessage)
        "Scissors" -> if (userChoice == "Rock") println(winMessage) else println(loseMessage)
    }
}


