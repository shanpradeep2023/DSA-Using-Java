package strings;

public class PalindromeOrNot {

    public boolean cheakPalindrome(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeOrNot p = new PalindromeOrNot();
        String str = "maiaam";
        boolean result = p.cheakPalindrome(str);
        System.out.println(result);
    }

}
