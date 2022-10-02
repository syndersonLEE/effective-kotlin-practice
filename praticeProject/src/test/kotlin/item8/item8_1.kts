data class Printer(String : name)


/**
 * Nullable 처리법
 *
 * 1. ?, 스마트 캐스팅, Elvis 연산자를 활용하여 안전하게 처리
 * 2. exception throw
 * 3. 함수 또는 Property를 refactoring 하여 nullable이 나오지 않도록 함
 */
fun main() {
    val printer: Printer? = getPrinter()
    printer.print()
    printer?.print()
    if(printer != null) printer.print()
    printer!!.print()
}
