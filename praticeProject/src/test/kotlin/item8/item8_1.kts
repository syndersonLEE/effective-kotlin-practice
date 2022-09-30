data class Printer(String : name)


fun main() {
    val printer: Printer? = getPrinter()
    printer.print()
    printer?.print()
    if(printer != null) printer.print()
    printer!!.print()
}