fun main() {
    print(nonAdj(intArrayOf(5,2,3,4,1)))
}

fun nonAdj(A: IntArray): Int {
    // write your code in Kotlin
    //var sum = 0
    var min = Int.MAX_VALUE; var secondMin = Int.MAX_VALUE; var thirdMin = Int.MAX_VALUE
    var minIdx = 0; var secondMinIdx = 0; var thirdMinIdx = 0;
    for (i in 1..A.size-2) {
        when {
            min > A[i] -> {
                thirdMin = secondMin
                secondMin = min
                min = A[i]
                thirdMinIdx = secondMinIdx
                secondMinIdx = minIdx
                minIdx = i
            }
            secondMin > A[i] -> {
                thirdMin = secondMin
                secondMin = A[i]
                thirdMinIdx = secondMinIdx
                secondMinIdx = i
            }
            thirdMin > A[i] -> {
                thirdMin = A[i]
                thirdMinIdx = i
            }
        }
    }
    //print("$min $sMin $tMin $minIdx $sMinIdx $tMinIdx ")
    if (secondMinIdx != minIdx + 1) {
        return secondMin + min
    }
    if (thirdMinIdx != minIdx + 1) {
        return thirdMin + min
    }
    return secondMin + thirdMin
}