package item1

data class User3(val name : String)

class UserRepository {
    private val storedUsers : MutableMap<Int, String> = mutableMapOf()

    fun loadAll() : MutableMap<Int, String> {
        return storedUsers
    }
}

fun main() {
    val userRepository = UserRepository()

    val storedUsers = userRepository.loadAll()
    storedUsers[4] = "Sangyun"

    println(userRepository.loadAll())
}