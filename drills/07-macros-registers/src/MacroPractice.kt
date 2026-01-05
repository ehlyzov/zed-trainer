package drills.macros

data class Person(val name: String, val score: Int)

object MacroPractice {
    val rawTags = listOf(
        "alpha",
        "beta",
        "gamma",
        "delta"
    )

    val fruits = listOf("apple", "banana", "cherry")

    val placeholders = listOf(
        "FRUIT_ONE",
        "FRUIT_TWO",
        "FRUIT_THREE"
    )

    val people = listOf(
        "ada,10",
        "ben,12",
        "cid,8",
        "dee,11"
    )
}
