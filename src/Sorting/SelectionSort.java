package Sorting;

/**
 * Created by NavyaKaree on 11/1/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbersList = {12, 32, 10, 25, 9};


        selectionSort(numbersList);
        for (int n:numbersList) {

            System.out.println(n);

        }
    }

    private static void selectionSort(int[] numbersList) {
        int n= numbersList.length;
        int j;
        for(int k=0; k<n-1; k++){
            int min = numbersList[k];
            int minindex = k;
            for(j=k+1; j<n; j++){
                if(numbersList[j]<numbersList[minindex]){
                    minindex= j;
                }
            }
            if(k!= minindex){
                numbersList[k]= numbersList[minindex];
                numbersList[minindex]= min;
            }
        }
    }


}