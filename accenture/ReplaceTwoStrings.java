package accenture;

public class ReplaceTwoStrings {
    public static String replace(String str, int n, char ch1, char ch2){
        String res = "";

        for(int i=0;i<n;i++){
            if(str.charAt(i) == ch1)
                res = res + ch2;
            else if(str.charAt(i) == ch2)
                res = res + ch1;

            else
                res = res + str.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "apples";
        int n = str.length();
        char ch1 = 'p';
        char ch2 = 'a';

        System.out.println(replace(str, n, ch1, ch2));
    }
}
