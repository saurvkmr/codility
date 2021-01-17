fun main() {
    print(maxProfit(intArrayOf(5,4,3,2,1)))
}

fun maxProfit(A: IntArray): Int {
    var maxProfit = 0; var buyPrice = Int.MAX_VALUE

    for (i in A) {
        buyPrice = Math.min(buyPrice, i)
        maxProfit = Math.max(maxProfit, i - buyPrice)

    }
    return maxProfit
}