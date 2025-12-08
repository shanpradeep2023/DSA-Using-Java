package finacle;

public class DistinctString {
    public static String compute(String str) {
        StringBuilder b = new StringBuilder();
        str.chars()  // Convert the string into a stream of characters
            .distinct()  // Remove duplicates from the stream
            .forEach(c -> b.append((char) c));  // Append each distinct character to the StringBuilder
        return b.toString();
    }

    public static void main(String[] args) {
        System.out.println(compute("abcabc"));
    }
}
