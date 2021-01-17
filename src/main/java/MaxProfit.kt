fun main() {
    print(maxProfit(intArrayOf(5,4,3,2,1)))
}

fun maxProfit(A: IntArray): Int {
    var maxProfit = 0; var buyPrice = Int.MAX_VALUE; var sellPrice = 0

    for (i in A.indices) {
        if (A[i] < buyPrice) {
            buyPrice = A[i]
        } else if (sellPrice < A[i]) {
            sellPrice = A[i]
        }
        maxProfit = Math.max(maxProfit, sellPrice - buyPrice)

    }
    return maxProfit
}