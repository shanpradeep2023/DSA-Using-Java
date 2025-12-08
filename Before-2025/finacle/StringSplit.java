package finacle;

import java.util.HashMap;

public class StringSplit {
    public static String split(String str){
        int min = 999999;
        String arr[] = str.split(";");
        HashMap<Integer,String> map = new HashMap<>();
        for(String s : arr){
            String s1[] = s.split(" ");
            map.put(Integer.parseInt(s1[1]),s1[0]);
        }

        for(HashMap.Entry<Integer,String> entry : map.entrySet()){
            if(entry.getKey() < min)
                min = entry.getKey();
        }

        return map.get(min);
    }

    public static void main(String[] args) {
        System.out.println(split("orange 10;bucket 9;bus 60"));
    }
}
