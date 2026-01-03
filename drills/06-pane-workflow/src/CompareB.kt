package drills.panes

/**
 * Alternative implementation of a score calculation.  It intentionally uses
 * different logic so you can practise editing to match `CompareA.kt`.
 */
object CompareB {
    fun calculateScore(values: List<Int>): Int {
        var score = 0
        for (v in values) {
            score += v // add instead of doubling — fix this during the drill
        }
        return score
    }
}