package sorting_net;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {9,32,12,54,234,3,34};
        sortArray(arr);
    }

    public static void sortArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    int firstNumber = arr[j+1];
                    int secondNumber = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
