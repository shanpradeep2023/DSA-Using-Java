package patterns;

public class Patterns {

    public static void p1(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p2(int n){
        for(int i = 0;i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p3(int n){
        
    }
    public static void main(String[] args) {
        p1(5);
        p2(5);
        p3(5);
    }
}
