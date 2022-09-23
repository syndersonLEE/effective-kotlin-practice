package item1

import java.util.*

data class FullName(val firstName : String,val lastName : String)

fun main() {
    val names :SortedSet<FullName> = TreeSet()
    val person = FullName("Sangyun","LEE")
    names.add(person)
    names.add(FullName("Somin", "LEE"))
    names.add(FullName("Sangmin", "In"))

    print(names)
    print(person in names)

}