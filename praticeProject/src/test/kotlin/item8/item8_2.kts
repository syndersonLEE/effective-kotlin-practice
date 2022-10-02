/**
 * null 안전하게 처리하기
 */

fun safeNull() {
    printer?.print() // 안전 호출
    if(print != null) printer.print() // 스마트 캐스팅
}

/**
 * Elvis 연산자 사용
 */

fun safeNull2() {
    val printerName1 = printer?.name ?: "Unnamed"
    val printerName2 = printer?.name ?: return
    val printerName3 = printer?.name ?: throw Error("Printer must be named")
}

/**
 * Smart Casting 사용
 */

fun safeNull3() {
    println("What is your name")
    val name = readLine()
    if(!name.isNullOrBlank()) {
        println("Hello ${name.toUpperCase()}")
    }
    val news : List<News>? = getNews()
    if (!news.isNullOrEmpty()) {
        news.forEach {notifyUser(it)}
    }
}