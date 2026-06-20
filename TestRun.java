import java.util.Arrays;
import java.util.List;

public class TestRun {
    public static void main(String[] args) {
        String query = "What is the capital of France?";
        List<String> context = Arrays.asList("Paris is the capital of France.", "France is in Europe.");
        StringBuilder contextTextBuilder = new StringBuilder();
        for (int i = 0; i < context.size(); i++) {
            if (i > 0) contextTextBuilder.append("\n");
            contextTextBuilder.append("- ").append(context.get(i));
        }
        String contextText = contextTextBuilder.toString();

        String actual = "<start_of_turn>user\n" +
            "You are a helpful Private Librarian. Answer the question based ONLY on the provided context.\n" +
            "\n" +
            "Context:\n" +
            contextText + "\n" +
            "\n" +
            "Question: " + query + "\n" +
            "<end_of_turn>\n" +
            "<start_of_turn>model";

        String expected = "<start_of_turn>user\n" +
            "You are a helpful Private Librarian. Answer the question based ONLY on the provided context.\n" +
            "\n" +
            "Context:\n" +
            "- Paris is the capital of France.\n" +
            "- France is in Europe.\n" +
            "\n" +
            "Question: What is the capital of France?\n" +
            "<end_of_turn>\n" +
            "<start_of_turn>model";

        System.out.println("ACTUAL:");
        System.out.println(actual);
        System.out.println("===");
        System.out.println("EXPECTED:");
        System.out.println(expected);
        System.out.println("===");
        System.out.println("MATCH? " + actual.equals(expected));

        for (int i = 0; i < Math.min(actual.length(), expected.length()); i++) {
            if (actual.charAt(i) != expected.charAt(i)) {
                System.out.println("Difference at " + i + ": actual='" + actual.charAt(i) + "' (" + (int)actual.charAt(i) + "), expected='" + expected.charAt(i) + "' (" + (int)expected.charAt(i) + ")");
                break;
            }
        }
    }
}
