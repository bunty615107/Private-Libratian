val context = listOf("Paris is the capital of France.", "France is in Europe.")
val contextText = context.joinToString("\n") { "- $it" }
println(contextText)
