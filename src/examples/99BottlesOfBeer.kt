package examples

/**
 * This example implements the famous "99 Bottles of Beer" program
 * See http://99-bottles-of-beer.net/
 *
 * The point is to print out a song with the following lyrics:
 *
 *     The "99 bottles of beer" song
 *
 *     99 bottles of beer on the wall, 99 bottles of beer.
 *     Take one down, pass it around, 98 bottles of beer on the wall.
 *
 *     98 bottles of beer on the wall, 98 bottles of beer.
 *     Take one down, pass it around, 97 bottles of beer on the wall.
 *
 *       ...
 *
 *     2 bottles of beer on the wall, 2 bottles of beer.
 *     Take one down, pass it around, 1 bottle of beer on the wall.
 *
 *     1 bottle of beer on the wall, 1 bottle of beer.
 *     Take one down, pass it around, no more bottles of beer on the wall.
 *
 *     No more bottles of beer on the wall, no more bottles of beer.
 *     Go to the store and buy some more, 99 bottles of beer on the wall.
 *
 * Additionally, you can pass the desired initial number of bottles to use (rather than 99)
 * as a command-line argument
 */
fun main(args: Array<String>) {
    printBottles(5)
}

fun printBottles(number: Int) {
    var n = number
    while(n >= 0) {
        when(n) {
            0 -> println("${bottlesToString(n)} of beer on the wall, ${bottlesToString(n)} of beer.\n" +
                    "Go to the store and buy some more, $number bottles of beer on the wall.\n")
            else -> println("${bottlesToString(n)} of beer on the wall, ${bottlesToString(n)} of beer.\n" +
                    "Take one down, pass it around, ${bottlesToString(n-1)} of beer on the wall.\n")
        }
        n--
    }
}

fun bottlesToString(number: Int): String =
        when(number) {
            1 -> "1 bottle"
            0 -> "No more bottles"
            else -> "$number bottles"
        }