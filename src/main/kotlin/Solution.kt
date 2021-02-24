class Solution {
}

fun main() {
    val solver = Solution()
}

private fun assertEquals(expected: Any, actual: () -> Any) {
    println("=> expected: $expected, actual: ${actual.invoke()}")
}
