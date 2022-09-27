package item5

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.contracts.contract
import kotlin.test.assertEquals

fun factorial(n: Int) : Long {
    require(n >= 0) {
        "음수는 계산이 불가능합니다."
    }
    return if (n <= 1) 1 else factorial(n - 1) * n
}

class factorialTestClass {
    @Test
    @DisplayName("Factorial Test")
    fun testFactorial() {
        factorial(-1);
        assertEquals(factorial(3), 6);
    }
}
