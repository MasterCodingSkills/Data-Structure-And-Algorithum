package sortingTechniques;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {48,-2,87,23,-83,10,20,55,29};

        insertionSort(arr);
        UtilityClass.printArray(arr);
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int key = arr[i];

            while(j >=0 && key<arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
