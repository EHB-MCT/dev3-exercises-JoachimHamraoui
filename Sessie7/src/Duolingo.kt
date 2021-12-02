class Duolingo {

    val words = mutableSetOf<Word>(
        Word("vache", "koe", "FR"),
        Word("mère", "moeder", "FR"),
        Word("avion", "vliegtuig", "FR"),
        Word("batiment", "gebouw", "FR"),
        Word("école", "school", "FR"),
        Word("pool", "zwembad", "ENG"),
        Word("shark", "haai", "ENG"),
        Word("leg", "been", "ENG"),
        Word("feet", "voeten", "ENG"),
        Word("smoke", "roken", "ENG")

    )

    fun play() {
        val selectedWords = words.shuffled().take(5).toMutableList();

        while (selectedWords.count() > 0) {
            val selectedWord = selectedWords.random();
            println(selectedWord.original);
            val userAnswer = readLine();

            if(userAnswer == selectedWord.translated){
                selectedWords.remove(selectedWord)
            } else {
                println(selectedWord.translated)
            }

            println(selectedWords.count())
        }

        println("Great Job");
    }
}