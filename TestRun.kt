fun main() {
    val query = "What is the capital of France?"
    val context = listOf("Paris is the capital of France.", "France is in Europe.")
    val contextText = context.joinToString("\n") { "- $it" }

    val actual = """
        <start_of_turn>user
        You are a helpful Private Librarian. Answer the question based ONLY on the provided context.

        Context:
        $contextText

        Question: $query
        <end_of_turn>
        <start_of_turn>model
    """.trimIndent()

    val expected = """
        <start_of_turn>user
        You are a helpful Private Librarian. Answer the question based ONLY on the provided context.

        Context:
        - Paris is the capital of France.
        - France is in Europe.

        Question: What is the capital of France?
        <end_of_turn>
        <start_of_turn>model
    """.trimIndent()

    println("ACTUAL:")
    println(actual)
    println("===")
    println("EXPECTED:")
    println(expected)
    println("===")
    println("MATCH? ${actual == expected}")

    println("Diff:")
    for (i in 0 until Math.min(actual.length, expected.length)) {
        if (actual[i] != expected[i]) {
            println("Difference at $i: actual='${actual[i]}' (${actual[i].code}), expected='${expected[i]}' (${expected[i].code})")
            break
        }
    }
}
