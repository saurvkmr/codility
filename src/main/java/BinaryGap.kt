import kotlin.math.max

fun main() {
    println(32.binaryGap())
}

fun Int.binaryGap(): Int {
    val value = Integer.toBinaryString(this)
    var maxZero = 0
    var count = 0
    var countOne = 0
    for (element in value) {
        when(element == '0'){
            true -> {
                count++
            }
            false -> {
                maxZero = max(maxZero, count)
                count = 0
                countOne++
            }
        }
    }
    return if (countOne > 1) maxZero else 0
}