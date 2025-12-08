package finacle;

public class StringReversal {
    public static String stringReversal(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(stringReversal("hello world"));
    }
}
