package drills.editing

/**
 * This file intentionally contains poor formatting to practise joining and splitting lines.
 */
object FormattingMe {
    fun greeting(): String {
        return "Hello, " +
            "this is a very long greeting that should be joined into one line " +
            "for the purposes of this exercise."
    }

    fun numbers(): List<Int> {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        return numbers
    }
}