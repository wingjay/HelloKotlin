/**
 * Created by wingjay on 22/11/2017.
 */


fun sayHello() : String {
    return "Hello, This is Kotlin"
}

fun sayHelloInMultiLanguage(lan: String) {
    val language = if(lan.equals(null)) "EN" else lan;
    println(when(language) {
        "EN" -> "Hello"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Don't know your language: $language yet"
    })
}

class Greeter(val name: String) {
    fun greet(newbie: String) {
        println("Hey $newbie, I'm $name")
    }
}

fun main(args: Array<String>) {
//    println(sayHello())
//    sayHelloInMultiLanguage("FR")

    Greeter("Jay").greet("John")
}