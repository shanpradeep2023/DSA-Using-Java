package arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersectionOfTwoArrays(int[] num1, int[] num2){
        Set<Integer> set1 = new HashSet<>();   
        Set<Integer> result = new HashSet<>();

        for(int num : num1){
            set1.add(num);
        }
        for(int num : num2){
            if(set1.contains(num))
                result.add(num);
        }

        int[] arr = new int[result.size()];
        int i=0;
        for(int num : result){
            arr[i] = num;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        int[] result = intersectionOfTwoArrays(num1, num2);

        for(int num : result)
            System.out.print(num + " ");
    }
}
