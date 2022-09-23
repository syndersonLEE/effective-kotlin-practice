package item1

import kotlin.properties.Delegates

fun main() {
    var names by Delegates.observable(listOf<String>()) {
        _, old, new -> println("Names changed from $old to $new")
    }

    names += "Sangyun"
    names += "Doyoung"
}