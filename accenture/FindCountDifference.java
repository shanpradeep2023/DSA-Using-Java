package accenture;

public class FindCountDifference {
    public static int findCount(int arr[],int n,int num,int diff){
        int count = 0;
        for(int i = 0;i<n;i++){
            if(Math.abs (arr[i] - num) <= diff){
                count++;
            }
        }
        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 14, 56, 13, 77};
        int n = arr.length;
        System.out.println(findCount(arr, n, 13, 2));
    }
}
