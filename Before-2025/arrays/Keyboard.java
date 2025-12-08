package arrays;

import java.util.Arrays;

public class Keyboard {
    public static int compute(int arr[]){
        Arrays.sort(arr);

        
        return arr[arr.length -1] - arr[0] + 1;

        
    }

    public static void main(String[] args) {
        int[] arr = {15,16,17,18,19,20};
        System.out.println(compute(arr));

    }
}
