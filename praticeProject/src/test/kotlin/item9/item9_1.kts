/**
 * close()를 사용하여 명시적으로 닫아야 하는 리소스 종류
 * 1. InputStream()과 OutputStream()
 * 2. java.sql.Connection
 * 3. java.io.Reader(FileReader, BufferdReader, CSSParser)
 * 4. java.new.Socket과 java.util.Scanner
 *
 * AutoCloseable을 상속 받는 Closeable 인터페이스를 implement
 * 그러나 Garbage Collection이 처리하기엔 매우 느리기 때문에 명시적으로 close 필요
 */


/**
 * close()를 항상 처리
 */
fun countCharactersInFile(path : String) : Int {
    val reader = BufferedReader(FileReader(path))
    reader.user {
        return reader.lineSequence().sumBy{ it.length }
    }
}

fun countCharactersInFile2(path : String) : Int {
    BufferedReader(FileReader(path)).use { reader ->
        return reader.lineSequence().sumBy{ it.length }
    }
}

/**
 * use() 혹은 한줄씩 사용할 경우 useLines
 */