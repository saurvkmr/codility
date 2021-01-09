fun main() {
    print(divCount(6,11,2))
}

fun divCount(A: Int, B: Int, K: Int): Int {
    val count = when {
        (A % K == 0) -> 1
        else -> 0
    }
    return (B/K) - (A/K) + count
}