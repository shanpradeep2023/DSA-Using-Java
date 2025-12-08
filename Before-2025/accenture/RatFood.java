package accenture;

// import java.util.Scanner;

public class RatFood {

    public static int compute(int r, int unit, int n, int arr[]){
        int sum = 0;
        int count = 0;
        int result = r * unit;
        if(arr == null)
            return -1;

        for(int i=0;i<n;i++){
            sum += arr[i];
            count++;
            if(sum >= result)
                return count;


        }

        return 0;

    }

    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        int arr[] = {7,7,2,1,5,6,7,8};
        int n = arr.length;

        // for(int i=0;i<n;i++){
        //     System.out.println("Enter number "+(i+1)+": ");
        //     arr[i] = sc.nextInt();
        // }

        System.out.println(compute(7,2,n,arr));
    }
}
