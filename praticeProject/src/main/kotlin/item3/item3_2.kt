package item3

import item2.User

val repo = UserRepo()
val user1 = repo.user
val user2 : User = repo.user
val user3 : User? = repo.user