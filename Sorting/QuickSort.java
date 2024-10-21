class QuickSort{

    public static void quicksort(int [] arr,int l,int h){
       if(l<h){
            int s = partition(arr, l, h);
            quicksort(arr, l, s-1);
            quicksort(arr, s+1, s-1);
       }
    }

    public static int partition(int [] arr,int l,int h){
        int p = arr[h];
        int i = l-1;

        for(int j = l;j<=h;j++){
            if(arr[j] < p){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String a[]){
        int arr[] = {3,4,2,1,7,5,8};
        quicksort(arr,0,arr.length-1);

        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}