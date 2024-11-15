package finacle;

public class CircularArray {
    public static int compute(int arr[]){
        int sum = 0;
        int n = arr.length;
        int a[] = new int[n];
        a[0] = Math.abs(arr[1] - arr[n-1]);
        a[n-1] = Math.abs(arr[0] - arr[n-2]);
        for(int i=1;i<n-1;i++){
            a[i] = Math.abs(arr[i+1] - arr[i-1]);
        }

        for(int i=0;i<n;i++){
            sum += a[i]^i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1};
        System.out.println(compute(arr));
    }
}
