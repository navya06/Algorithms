package Sorting;

/**
 * Created by NavyaKaree on 11/7/16.
 */
public class QuickSort {
    public static void main(String[] args){
       int[] a= {88, 29, 74, 6, 89, 19};
        quickSort(a, 0, a.length-1);
        for(int i= 0;i<a.length;i++)
        System.out.println(a[i]);
    }

    private static void quickSort(int[] a, int low, int high) {
        if(low<high){
            int p= partition(a, low, high);
            quickSort(a, low, p-1);
            quickSort(a, p+1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot= a[high];
        int i= low;
        for( int j= low; j< high; j++){
            if(a[j]<=pivot){
               a= swap(i, j, a);
                i++;
            }
        }
        a= swap(i, high, a);
        return i;
    }

    private static int[] swap(int i, int i1, int[] a) {
        int temp;
        temp= a[i];
        a[i]=a[i1];
        a[i1]=temp;
        return a;
    }
}
