fun solution(A: IntArray): Int {
    var exp = A.size
    var sum = 0

    for (i in A.indices) {
        sum += A[i]
        exp += i+1
    }

    return exp - sum + 1
}

fun main() {
    print(solution(intArrayOf(1,2,4)))
}