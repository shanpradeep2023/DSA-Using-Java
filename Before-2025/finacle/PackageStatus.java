package finacle;



public class PackageStatus {
    public static String compute(String str){
        String[] a = str.split(";");
        return a[a.length-1];
    }

    public static void main(String[] args) {
        System.out.println(compute("delivered;returned;on-hold"));
    }
}
