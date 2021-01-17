fun main() {
    print(maxSliceSum(intArrayOf(-3, -2, -6, -4, -1)))
}

fun maxSliceSum(A: IntArray): Int {
    var maxSliceSum = -1000000
    var sum = -1000000
    for (i in A) {
        sum = Math.max(i, sum + i)
        maxSliceSum = Math.max(maxSliceSum, sum)
    }
    return maxSliceSum
}