package drills.multicursor

/**
 * This file contains multiple occurrences of the same variable to practise multi‑cursor renaming.
 */
fun calculateValues(input: List<Int>): List<Int> {
    val output = mutableListOf<Int>()
    for (i in input) {
        val tempValue = i * 2
        // do some intermediate calculation
        val tempValueSquared = tempValue * tempValue
        output.add(tempValueSquared)
    }
    return output
}