package item1

class User (
    val name: String,
    val surname : String
        ) {
    fun withSurname(surname : String) = User(name, surname)
}

fun main() {
    var user = User("Haerin", "Kim")
    user = user.withSurname("Minkyung")
    print(user)
}
