package accenture;

import java.util.*;

public class SecondLargestSmallestEvenOddArray {
    public static int compute(int[] arr, int n){
        ArrayList <Integer> even = new ArrayList <Integer> ();
        ArrayList <Integer> odd = new ArrayList <Integer> ();

        if(arr == null || arr.length <=3)
            return 0;
        
        even.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(i%2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int evenEle = even.get(even.size() - 2);
        int oddEle = odd.get(1);

        int res = evenEle + oddEle;
        return res;

    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 7, 5, 4};
        int n = arr.length;
        System.out.println(compute(arr, n));
    }
}
