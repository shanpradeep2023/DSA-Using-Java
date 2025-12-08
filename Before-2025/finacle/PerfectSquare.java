package finacle;

public class PerfectSquare {
    public static int compute(int[] arr){
        int count = 0;
        
        for(int num : arr){
            int sqrt = (int)Math.sqrt(num);
            if(sqrt*sqrt == num)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,9,9};
        System.out.println(compute(arr));
    }
}
