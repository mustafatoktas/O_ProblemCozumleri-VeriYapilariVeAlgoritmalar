class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size) { 0 }
        val stack = mutableListOf<Int>()

        temperatures.forEachIndexed { index, temp ->
            while (stack.isNotEmpty() && temperatures[stack.last()] < temp) {
                val lastIndex = stack.removeAt(stack.size - 1)
                result[lastIndex] = index - lastIndex
            }
            stack.add(index)
        }

        return result
    }
}


fun main() {
    val temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
    val temperatures2 = intArrayOf(30, 40, 50, 60)
    val temperatures3 = intArrayOf(30, 60, 90)
    println(Solution().dailyTemperatures(temperatures).joinToString(", "))
    println(Solution().dailyTemperatures(temperatures2).joinToString(", "))
    println(Solution().dailyTemperatures(temperatures3).joinToString(", "))
}