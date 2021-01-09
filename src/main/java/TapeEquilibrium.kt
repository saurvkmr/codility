fun tapeEquilibrium(A: IntArray): Int {
    var sum = A.sum()
    var s = 0
    var minDiff = Int.MAX_VALUE
    var temp = 0
    for (i in A.indices) {
        if (i != 0) {
            s += A[i-1]
            temp = Math.abs((sum - s) - s)
            if (temp < minDiff)
                minDiff = temp
        }
    }
    return minDiff
}

fun main() {
    print(tapeEquilibrium(intArrayOf(3,1,2,4,3)))
}