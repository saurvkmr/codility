fun main() {
    print(dreamTeam(intArrayOf(7, 1, 4, 4), intArrayOf(5, 3, 4, 3), 2))
}

private fun dreamTeam(A: IntArray, B: IntArray, F: Int): Int {
    val listA = ArrayList<DreamTeam>()
    var sum = 0
    var f = F
    for ( i in A.indices) {
        listA.add(DreamTeam(A[i], A[i] - B[i]))
    }
    listA.sortByDescending { it.value }
    var i = 0
    while (i < A.size ) {
        if (f > 0) {
            sum += listA[i].value
            f--
        } else {
            sum += listA[i].value - listA[i].diff
        }
        i++
    }
    return sum
}

data class DreamTeam(var value: Int, var diff: Int) : Comparable<Int> {
    override fun compareTo(other: Int) = value.compareTo(other)
}