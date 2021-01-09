fun sumExists(A: IntArray, k: Int): Boolean {
    var back = 0
    var front = 0
    var indx = 0
    var sum = 0
    while (back < A.size) {
        while (front < A.size && sum < k) {
            sum += A[front]
            front++
        }
        if (sum == k)
            return true
        back++
    }
    return false
}

fun main() {
    print(sumExists(intArrayOf(6,2,7,4,1,3,6), 12))
}