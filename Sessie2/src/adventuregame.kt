fun main() {
    println("Welcome to The World That Never Was, your journey with the Keyblade has led you to the domain of Organization XIII");
    println("Do you wish to stop here or to continue?");
    getUserChoice();
}

fun getUserChoice() {
    val userChoice: String?
    userChoice = readLine();

    if (userChoice == "Continue") {
        println("You have chosen to go further on your quest. There is no point of return.")
    } else if (userChoice == "Stop here") {
        println("You're probably going to do some sidequests")
    }
}