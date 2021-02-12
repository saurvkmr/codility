// https://app.codility.com/programmers/task/different_characters/

fun main() {
    differentChars("abaacbca", 2)
}

private fun differentChars(S: String, K: Int) {
    val charCount = IntArray(26)
    var chars = S.toCharArray()
    for (i in chars) {
        charCount[(i - 97).toInt()] += 1
    }
    var front = 1
    var back = 0
    var subStringLen = 1
    while (front != back) {
        if (typesOfCharCount(charCount) > 2) {
            front++
            subStringLen = Math.min(subStringLen, front - back)
        } else {
            var c = chars[back]
            charCount[(c - 97).toInt()] -= 1
            back++
            if (typesOfCharCount(charCount) == 2) {
                subStringLen = Math.min(subStringLen, front - back)
            }
        }
    }
    print(subStringLen)
}

private fun typesOfCharCount(charCount: IntArray): Int {
    var count = 0
    for (i in charCount) {
        if (i > 0)
            count++
    }
    return count
}