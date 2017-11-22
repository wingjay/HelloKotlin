package delegate

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by wingjay on 22/11/2017.
 */
fun main(args: Array<String>) {
//    tryCustomize()
//    tryLazy()
//    tryObservable()
    tryNotNull()
}

/******** NotNull ********/
fun tryNotNull() {
    val user = NotNullUser()
//    println(user.name)
    user.name = "Jay"
    println(user.name)
}

class NotNullUser {
    var name: String by Delegates.notNull()
}
/******** NotNull ********/

/******** Observable ********/
fun tryObservable() {
    val user = ObservableUser()
    user.name = "Eric"
    user.name = "BatMan"
}

class ObservableUser {
    var name: String by Delegates.observable("Jay") {
        property, old, new -> println("name changes from $old to $new")
    }
}
/******** Observable ********/

/******** Lazy ********/
fun tryLazy() {
    val lazyUser = LazyUser()
    println(lazyUser.name)
}

class LazyUser {
    val name: String by lazy {
        println("computed")
        "Jay"
    }
}
/******** Lazy ********/

/******** Customize Delegate  ********/
fun tryCustomize() {
    val user = User()
    println(user.name)
    user.name = "Jay"
}

class User {
    var name: String by Delegate()

    override fun toString() = "User"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}
/******** Customize Delegate  ********/
