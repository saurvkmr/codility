import kotlin.math.max

fun main() {
    println(getMaxSlice(intArrayOf(5,-7,3,5,-2,4,-1)))
}

fun getMaxSlice(A: IntArray): Int {
    var maxEnding = 0; var maxSlice = 0; var leftIdx = 0; var rightIdx = 0
    for (i in A.indices) {
        maxEnding = max(0, maxEnding + A[i])
        if (maxEnding == 0)
            leftIdx = i+1
        if (maxSlice < maxEnding) {
            maxSlice = maxEnding
            rightIdx = i
        }
    }
    println("$leftIdx $rightIdx")
    return maxSlice
}