package accenture;

public class PasswordCheaker {

    public static int validate(String str, int n){
        if(n < 4)
            return 0;
        if(str.charAt(0) >= '0' && str.charAt(0) <= '9')
            return 0;
        int cap = 0,num = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '/' || str.charAt(i) == ' ')
                return 0;
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                cap++;
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
                num++;
        }

        // if(cap > 0 && num > 0)
        //     return 1;
        // else
        //     return 0;

        return (cap > 0 && num > 0) ? 1 : 0;
        
    }

    public static void main(String[] args) {
        String str = "aA1_67sfdsfd";
        System.out.println(validate(str,str.length())); // 1
    }
}
