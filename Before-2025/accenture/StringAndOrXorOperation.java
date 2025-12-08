package accenture;

public class StringAndOrXorOperation {
    public static int compute(String str){
        int prev = str.charAt(0) - '0';
        int i = 1;
        while(i < str.length()){
            if(str.charAt(i) == 'A')
                prev = prev & str.charAt(i + 1) - '0';
            if(str.charAt(i) == 'B')
                prev = prev | str.charAt(i + 1) - '0';
            if(str.charAt(i) == 'C')
                prev = prev ^ str.charAt(i + 1) - '0';
            
            i+=2;
            
        }
        return prev;
        
    } 

    public static void main(String args[]){
        String str = "1A0A0B1C1C1";
        System.out.println(compute(str));
    }
}
