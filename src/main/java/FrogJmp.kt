fun solution(X: Int, Y: Int, D: Int): Int {
    // write your code in Kotlin
    val dis = Y - X
    var res = (dis / D)
    return if (dis % D == 0) res else ++res
}

fun main() {
    print(solution(10, 85, 30))
}

