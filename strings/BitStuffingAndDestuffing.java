package strings;

public class BitStuffingAndDestuffing {
    public static String stuff(String data){
        StringBuilder stuff = new StringBuilder();
        int count = 0;
        for(char c : data.toCharArray()){
            stuff.append(c);
            if(c == '1'){
                count += 1;
                if(count == 5){
                    stuff.append('0');
                    count = 0;
                }
            }else{
                count = 0;
                
            }
            
        }
        return stuff.toString();
    }

    public static String deStuff(String data){
        StringBuilder deStuff = new StringBuilder();
        int count = 0;
        for(char c : data.toCharArray()){
            
            if(c == '1')
                count++;
            
            if(c == '0' && count == 5){
                count=0;
                continue;
            }

            deStuff.append(c);
                
            
        }
        return deStuff.toString();
    }

    public static void main(String[] args) {
        System.out.println(deStuff("111110111110110000011111011"));
    }
}
