
import java.util.Arrays


fun solution(A: IntArray): Int {
    Arrays.sort(A)
    var i = 0
    while (i < A.size) {
        if (A[i] !== ++i) return i
    }
    return ++i
}

fun main() {
    print(solution(intArrayOf(1,2,4)))
}