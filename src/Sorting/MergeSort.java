package Sorting;

/**
 * Created by NavyaKaree on 11/3/16.
 */
public class MergeSort {

    public static void main(String[] args){
        int[] a={13, 19, 78, 29, 34, 5, 9, 10, 50};
        a= mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    private static int[] mergeSort(int[] b) {
        int n= b.length;
        if((n)<2){
            return b;
        }
        int mid = (n)/2;
        int[] left= new int[mid];
        int[] right = new int[n-mid];
        for(int i=0;i<mid;i++)
            left[i]=b[i];
        for(int j=mid;j<n;j++)
            right[j-mid]=b[j];
        left=mergeSort(left);
        right=mergeSort(right);
        int[] result = merge(left, right);
        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int r = left.length+right.length;
        int[] result = new int[r];
        int i=0, j=0, k=0;
        while (i<left.length || j<right.length){
            if(i<left.length && j<right.length) {
                if (left[i] <= right[j]) {
                    result[k] = left[i];
                    i = i + 1;
                } else {
                    result[k] = right[j];
                    j = j + 1;
                }
            }
            else if(i<left.length) {
                result[k] = left[i];
                i++;
            }
            else if(j<right.length) {
                result[k] = right[j];
                j++;
            }
            k=k+1;
        }
        return result;
    }
}
