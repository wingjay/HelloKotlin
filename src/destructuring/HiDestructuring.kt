package destructuring

/**
 * Created by wingjay on 22/11/2017.
 */

fun main(args: Array<String>) {
//    tryPair()
//    tryDataClass()
//    tryHashMap()
    tryAutoGenFunction()
}

fun tryAutoGenFunction() {
    // toString(), equals(), hashCode() and copy() will be auto-generated for data-class
    val user = User("Jay", 1)
    println(user.copy("John"))
    println(user.copy(id = 2))
    println(user.copy("Eric", 3))
    println(user)

    val mockUser = User("Jay", 1)
    println("same User? ${user == mockUser}")
}

fun tryHashMap() {
    val map = hashMapOf<String, Int>()
    map.put("First", 1)
    map.put("Second", 2)
    map.put("Third", 3)
    // Traversing hashMap
    for((k, v) in map) {
        println("$k, $v")
    }
}

fun tryPair() {
    val (sum, diff) = calculate(10, 2)
    println("first = $sum, second = $diff")
}

fun tryDataClass() {
    val simplePair = User("Jay", 101)
    println("first: ${simplePair.name}, second: ${simplePair.id}")

    val (first, second) = User("Jay", 101)
    println("first = $first, second = $second")

    println("component1: ${simplePair.component1()}, component2: ${simplePair.component2()}")
}

fun calculate(x: Int, y: Int): Pair<Int, Int> {
    return Pair(x+y, x-y)
}

data class User(val name: String, val id: Long)

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}