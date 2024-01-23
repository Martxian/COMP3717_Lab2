package com.example.lab2siomarvin

/*
    Marvin Sio
    A01176817
 */

fun main() {
    val sentence = arrayOf("The", "Quick", "Brown", "Fox", "Went", "Over", "The", "Lazy", "Dog")
    val wordLengths: MutableList<Int> = mutableListOf()

    for (word in sentence) {
        wordLengths.add(word.length)
    }

    var largestWordLength = 0
    var smallestWordLength = wordLengths[0]

    wordLengths.forEach {
        if (largestWordLength < it) {
            largestWordLength = it
        }
        if (smallestWordLength > it) {
            smallestWordLength = it
        }
    }

    val largestWords: MutableList<String> = mutableListOf()
    val smallestWords: MutableList<String> = mutableListOf()

    var i = 0
    while (i < sentence.size) {
        val currentWord = sentence[i]

        var isDuplicate = false
        for (word in largestWords) {
            if (currentWord.length == largestWordLength && currentWord == word) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate && currentWord.length == largestWordLength) {
            largestWords.add(currentWord)
        }

        isDuplicate = false
        for (word in smallestWords) {
            if (currentWord.length == smallestWordLength && currentWord == word) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate && currentWord.length == smallestWordLength) {
            smallestWords.add(currentWord)
        }

        i++
    }

    println("Words: ${sentence.contentToString()}")
    println("Word lengths: $wordLengths")
    println("Longest word(s) $largestWords" )
    println("Shortest word(s): $smallestWords" )
}