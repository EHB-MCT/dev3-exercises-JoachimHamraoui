fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors");
    val computerChoice = options.random();
    val userChoice = getUserChoice(options)

    println("Computer picked $computerChoice");
    println("User picked $userChoice");
}

fun getUserChoice(options: Array<String>): String? {
    var userChoice: String?
    do {
        println("Make your choice: Rock - Paper - Scissors");
        userChoice = readLine();
    } while (!options.contains(userChoice))
    return userChoice
}

fun DetermineWinner(computerChoice: )