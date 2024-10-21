package Sorting;

public class CyclicSorting {

    public static void cyclicSort(int[] arr){
        int i = 0;

        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
    } 

    public static void swap(int[] arr, int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String args[]){
        int[] arr = {4, 3, 2, 1};
        cyclicSort(arr);
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }
}
