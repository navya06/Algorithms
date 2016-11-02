package Sorting;

/**
 * Created by NavyaKaree on 11/1/16.
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] a={15,5,23,4,10};
        insertionSort(a);
        for (int i:a) {
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] a) {
    int x, j;
        for(int i =1;i<a.length;i++){
            x=a[i];
            j=i-1;
            while(j>=0&&a[j]>x){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=x;
        }
    }

}
