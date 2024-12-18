public class SelectionSort {
    public static void main(String args[]){
        int a[] = {1,7,5,3,9,0,7,5,3,2};
        sort(a);

        for(int n : a){
            System.out.print(n+" ");
        }
    }

    public static void sort(int a[]){
        int j = 0;
        for(int i = 0;i<a.length-1;i++){
            int min = i;
            for(j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

            for(int n : a){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
