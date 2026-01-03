package drills.panes

/**
 * Reference implementation of a score calculation.  Use this file to compare
 * and synchronise with `CompareB.kt`.
 */
object CompareA {
    fun calculateScore(values: List<Int>): Int {
        var score = 0
        for (v in values) {
            score += v * 2
        }
        return score
    }
}