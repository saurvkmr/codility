import java.util.*

fun isCorrectlyNested(brackets: String): Int {
    val stack = Stack<Char>()
    for (c in brackets) {
        when {
            c == '(' -> stack.push(c)
            stack.isNotEmpty() && stack.peek() == '(' -> stack.pop()
            else -> return 0
        }
    }
    return if (stack.isEmpty()) 1 else 0
}

fun main() {
    print(isCorrectlyNested("))))))))))))"))
}