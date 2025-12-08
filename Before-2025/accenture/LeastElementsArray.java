package accenture;

import java.util.*;

public class LeastElementsArray {
    public static int compute(int arr[], int n, int sum){
        Arrays.sort(arr);
        if(n < 2)
            return 0;
        if(arr[0] + arr[1] <= sum){
            return arr[0]*arr[1];
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,7,1,2,9,12};
        System.out.println(compute(arr, arr.length, 9));
    }
}
