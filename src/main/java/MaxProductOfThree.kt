import kotlin.math.max

fun main() {
    print(getMaxProductOfThree(intArrayOf(-1,3,-4,7,7,-5,3,9, 9,3)))
}

fun getMaxProductOfThree(A: IntArray): Int {
    var max = Int.MIN_VALUE
    var sMax = Int.MIN_VALUE
    var tMax = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var sMin = Int.MAX_VALUE

    for (i in A) {
        when {
            max < i -> {
                tMax = sMax
                sMax = max
                max = i
            }
            sMax < i -> {
                tMax = sMax
                sMax = i
            }
            tMax < i -> {
                tMax = i
            }
            min > i -> {
                sMin = min
                min = i
            }
            sMin > i -> {
                sMin = i
            }
        }
    }
    return max((max * sMax * tMax), (max * min * sMin))
}