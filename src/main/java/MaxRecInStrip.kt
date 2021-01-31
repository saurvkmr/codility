fun main() {
    println(maxRecInStrip(intArrayOf(2, 3, 2, 3, 5), intArrayOf(3, 4, 2, 4, 2)))
    println(maxRecInStrip(intArrayOf(2, 10, 4, 1, 4), intArrayOf(4, 1, 2, 2, 5)))
    println(maxRecInStrip(intArrayOf(2, 3, 1, 3), intArrayOf(2, 3, 1, 3)))
}

private fun maxRecInStrip(A: IntArray, B: IntArray): Int {
    val countMap = HashMap<Int, Int>()
    for (i in A.indices) {
        var count = countMap.getOrDefault(A[i], 0)
        countMap[A[i]] = ++count
        count = countMap.getOrDefault(B[i], 0)
        countMap[B[i]] = ++count
    }

    var maxCount = 0
    var maxAppr = 0
    for ((k,v) in countMap) {
        if (v > maxCount) {
            maxAppr = k
            maxCount = v
        }
    }

    var pairCount = 0
    for (i in A.indices) {
        if (A[i] == maxAppr || B[i] == maxAppr) {
            pairCount++
        }
    }
    return pairCount
}