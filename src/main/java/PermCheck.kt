fun main () {
    print(checkPrem(intArrayOf(4,3,1)))
}

fun checkPrem(A: IntArray): Int {
    val nums = HashSet<Int>()
    var max = 0
    for (i in A) {
        nums.add(i)
        if (max < i)
            max = i
    }

    if (nums.size < A.size)
        return 0

    for (i in 1..max) {
        if (!nums.contains(i))
            return 0
    }
    return 1
}