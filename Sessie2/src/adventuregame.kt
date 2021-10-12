fun main() {
    println("Welcome to The World That Never Was, your journey with the Keyblade has led you to the domain of Organization XIII");
    Challenge1();
}

fun Challenge1() {
    val userChoice: String?
    userChoice = readLine();
    println("Do you wish to stop here or to continue?");
    if (userChoice == "Continue") {
        println("You have chosen to go further on your quest. There is no point of return.");
    } else if (userChoice == "Stop here") {
        println("You're probably going to do some sidequests")
    }
    Challenge2();
}

fun Challenge2() {
    val userChoice: String?
    userChoice = readLine();
    println("You've reached the main dungeon, but there are two entry points. Which entrance will you choose?");
    if (userChoice == "Left") {
        println("You died homie")
    } else if (userChoice == "Right") {
        println("You chose the RIGHT way ahaha you entered the dungeon");
    }
    Challenge3();
}

fun Challenge3() {
    val userChoice: String?
    userChoice = readLine();
    println("You've won the game dréré, choose 1 here");
    if (userChoice == "one") {
        println("Finished")
    } else if (userChoice == "two") {
        println("Lesgoo you lost")
    }
    endTheGame();
}

fun endTheGame() {
    println("The Game has Ended");
}