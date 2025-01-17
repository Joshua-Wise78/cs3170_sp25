/* 
    Name: Joshua Wise
    In-Class Problems 1
    Kotlin Basics
*/

fun main() {

    // 1. Print these messages on separate lines
    /*
    Use the val keyword when the value doesn't change.
    Use the var keyword when the value can change.
    When you define a function, you define the parameters that can be passed to it.
    When you call a function, you pass arguments for the parameters.
    */
    val name: String = "These be some words"
    var people: Int = 5

    // 2. Uncomment the following code and fix the compile error
    println("New chat message from a friend")

    // 3. Uncomment the following and fix the compile error
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
    

    // 4. Uncomment and fix this code so it prints:
    // The total part size is: 50
    val numberOfAdults: Int = 20
    val numberOfKids: Int = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    // 5. Uncomment and fix this code so it compiles
    val numCats: Int = 2
    var numDogs: Int = 4
    //numDogs += numCats

    // 6. After fixing number 5, write a print statement to print the number
    // of cats and dogs using the variables, like:
    // There are 2 cats and 4 dogs
    println("There are $numCats cats and $numDogs dogs")

    // 7. Write a when statement that prints whether there are more cats than 
    // dogs, more dogs than cats, are there are the same number of each.
    when {
        numDogs > numCats -> println("There are more dogs than cats")
        numCats > numDogs -> println("There are more cats than dogs")
        else -> println("There are equal number of cats and dogs")
    }

    // 8. Use when to determine if a character is a vowel or consonant and
    // print the result. Char has methods named lowerCaseChar() and
    // upperCaseChar() you can use, or you can assume upper/lowercase
    var character: Char = 'a'
    if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            println("The character $character is a vowel")
        } else {
            println("The character $character is not a vowel")
        }

    // 9. Use a for loop to print the numbers 0 to 9 in reverse order. Hint -
    // there is a downTo keyword
    for(i in 9 downTo 0) {
        println("i: $i")
    }

    // 10. Create one list with 3 of your favorite shows/movies/games/etc. and
    // print the list
    val listOfShows = mutableListOf("Harry Potter", "Star Wars", "Call Of Duty")
    println(listOfShows)

    // 11. Create another list with 2 or 3 of your least favorite shows/movies/
    // /games/etc. Then, create a third list that contains everything from both lists.
    // Print out this new list.
    val crappyGames = mutableListOf("Destiny 2", "Rocket League")
    println(crappyGames)

    val combinedList = mutableListOf<String>()
    combinedList.addAll(listOfShows)
    combinedList.addAll(crappyGames)

    // 12. Remove your most and least favorite from the combined list, and print
    // this new list. (You may need to modify what you did for 10 and 11)
    combinedList.remove("Destiny 2")
    combinedList.remove("Rocket League")
    println(combinedList)

    // 13. Create a string variable and set it to null, then print the string
    var nullString: String? = null
    println("$nullString")

    // 14. Make a variable and set it to the length of the string from 13 such that if
    // the string is null, the variable will be -1, then print the length.
    val nullLength: Int? = nullString?.length ?: -1
    println("$nullLength")

    // 15. Write a when statement that returns a string saying if the string
    // is empty, the string is short, the string is medium length, or the string
    // is long. It's up to you as to what short, medium, and long strings are.
    val wordLength: String = "this is a really long string that can do stuff"
    
    when(wordLength.length) {
        0 -> println("The string is empty")
        in 1..10 -> println("The string is short")
        in 11..20 -> println("The string is med")
        else -> println("The string is long")
    }

}