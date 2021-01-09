import java.util.*

fun main() {
    println(countDistinct(intArrayOf(1,2,3,3,4,4,5,5,6)))
    println(countDistinctWithoutExtraSpace(intArrayOf(1,2,3,3,4,4,5,5,6)))
}

// Space O(n) Time O(n)
fun countDistinct(A: IntArray): Int {
    return A.toSet().size
}

// Time O(nlogn)
fun countDistinctWithoutExtraSpace(A: IntArray): Int {
    var distinct = 1
    Arrays.sort(A)
    var i = 1
    var prev = 0
    while (i < A.size) {
        if (A[i] != A[prev]) {
            prev = i
            distinct++
        }
        i++
    }
    return distinct
}