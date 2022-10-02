/**
 * 오류 throw 하기
 *
 * throw, !!, reqireNotNull, checkNotNull 등으로 오류를 강제로 발생 하도록 작성
 */

fun process(user: User) {
    requireNotNull(user.name)
    val context = checkNotNull(context)
    val networkService = getNetWorkService(context) ?: throw NoInternetConnection()
    networkService.getData {
        data, userData -> show(data!!, userData!!)
    }
}