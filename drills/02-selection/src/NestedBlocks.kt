package drills.selection

/**
 * This file contains nested blocks to practise selection expansion and contraction.
 */
class Calculator {

    fun add(a: Int, b: Int): Int {
        val result = a + b
        return result
    }

    fun factorial(n: Int): Int {
        fun loop(acc: Int, i: Int): Int {
            return if (i > n) acc else loop(acc * i, i + 1)
        }
        return loop(1, 1)
    }

    fun processNumbers(numbers: List<Int>): List<Int> {
        val results = mutableListOf<Int>()
        for (num in numbers) {
            val doubled = num * 2
            results.add(doubled)
        }
        return results
    }
}