package item3

import item2.User

val users: List<User> = UserRepo().users!!.filterNotNull();

