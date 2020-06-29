package sortingTechniques;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {48,-2,87,23,-83,10,20,55,29};
        selectionSort(arr);
        UtilityClass.printArray(arr);
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
