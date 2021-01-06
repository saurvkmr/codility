fun solution(X: Int, Y: Int, D: Int): Int {
    // write your code in Kotlin
    val dis = Y - X;
    if (dis % D != 0) {
        return (dis / D) + 1
    }
    return dis / D
}

fun main() {
    print(solution(0, 90, 30))
}
