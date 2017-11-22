package syntax

/**
 * Created by wingjay on 22/11/2017.
 */
fun main(args: Array<String>) {
//    println(max(1, 2))
//    println(parseInt("123"))

//    println(getStringLength("abc"))
//    println(getStringLength(123))

//    testRange()
//    hiList()
    hiWhen("Hello")
}

fun hiWhen(obj: Any?) {
    when(obj) {
        1 -> println("one")
        is Int -> println("is int")
        "Hello" -> println("Greeting")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

fun hiList() {
    val list = arrayListOf<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    println(list)
    println(if(2 in list) "2 is in list" else "2 isn't in list")
    println(if(100 in list) "100 is in list" else "100 isn't in list")
}

fun testRange() {
    for(i in 1..5) {
        println(if(i in 1..3) "$i [in 1..3]" else i)
    }
}

fun getStringLength(obj: Any?) : Int? {
    if(obj is String)
        return obj.length
    return null
}

fun parseInt(str: String) : Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("$str is not Number")
    }

    return null
}

fun max(a: Int, b: Int) = if(a >= b) a else b