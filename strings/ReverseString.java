package strings;

public class ReverseString {
    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}
