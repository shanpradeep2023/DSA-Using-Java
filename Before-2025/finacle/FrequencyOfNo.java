package finacle;

import java.util.HashMap;

public class FrequencyOfNo {

    public static HashMap<Integer,Integer> count(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return map;
        
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3,4,1};
        HashMap<Integer, Integer> map = count(arr);

        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("number : "+entry.getKey() +" occurs "+entry.getValue()+" times");
        }

    }
}
