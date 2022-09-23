package item1

data class User2 (
    val name: String,
    val surname : String
)

fun main() {
    var user = User2("Haerin", "Kim")
    user = user.copy("Minkyung")
    print(user)
}