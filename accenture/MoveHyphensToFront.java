package accenture;

public class MoveHyphensToFront {
    public static String moveHypens(String str, int n){
        String res = "";

        for(int i=0;i<n;i++){
            if(str.charAt(i) == '-')
                res = str.charAt(i) + res;
            else
                res = res + str.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "Java-Project-On-VScode";
        int n = str.length();
        System.out.println(moveHypens(str, n));
    }
}
