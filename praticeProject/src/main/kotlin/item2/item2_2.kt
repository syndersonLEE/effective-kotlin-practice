package item2

fun main() {
    var numbers = (2..100).toList()
//    val primes = mutableListOf<Int>()
//
//    while(numbers.isNotEmpty()) {
//        val prime = numbers.first()
//        primes.add(prime)
//        numbers = numbers.filter {
//            it % prime != 0
//        }
//    }

//    val primes : Sequence<Int> = sequence {
//        var numbers = generateSequence (2) { it + 1 }
//
//        while(true) {
//            val prime = numbers.first()
//            yield(prime)
//            numbers = numbers.drop(1)
//                .filter { it % prime != 0 }
//        }
//    }

    val primes : Sequence<Int> = sequence {
        var numbers = generateSequence (2) { it + 1 }

        var prime : Int
        while (true) {
            prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }

    print(primes.take(10).toList())
}