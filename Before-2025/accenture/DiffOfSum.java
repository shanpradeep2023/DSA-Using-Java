package accenture;

public class DiffOfSum {
    public static int compute(int m, int n){
        int divisibleSum = 0;
        int nonDivisibleSum = 0;

        for(int i = 1 ; i <= m ; i++){
            if(i % n == 0)
                divisibleSum += i;
            else
                nonDivisibleSum += i;
        }

        return nonDivisibleSum - divisibleSum;
    }

    public static void main(String[] args) {
        System.out.println(compute(20, 4));
    }
}
