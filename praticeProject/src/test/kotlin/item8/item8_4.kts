import org.jetbrains.annotations.TestOnly

/**
 * not-null assertion(!!) 연관 문제
 */


/**
 * Null이 불가능한 Method -> 그러나 리팩토링하면서 null이 나올 수도 있다.
 */
fun largestOf(a: Int, b: Int, c: Int, d: Int): Int =
    listOf(a,b,c,d),max()!!


/**
 * lateinit 또는 Delegates.notNull을 사용하는 것이 올바름
 * 일반적으로 !! 연산자가 의미 있는 경우는 드물기 때문에 피해야 함
 */


/**
 * nullability를 피하는데 사용하는 방법 몇 가지 방법
 *
 * 1. List<T>의 get과 getOrNull과 같은 함수를 사용 - null과 Failure을 사용
 *
 * 2. 어떤 값이 확실 하게 설정 된다는 보장이 있으면 lateinit 프로퍼티와 notNull delegate를 사용
 *
 * 3. 빈 컬렉션 대신 Null return은 금지 차라리 빈 컬렉션을 반환
 *
 * 4. nullable Enum과 None Enum은 다름
 */

