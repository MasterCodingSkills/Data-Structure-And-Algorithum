package sortingTechniques;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {48,-2,87,23,-83,10,20,55,29};

        // as we can see java is call by value so we don't need any return type from bubble sort function.
        //bubbleSortArrayInAsc(arr);
        //printArray(arr);
        bubbleSortArrayInDsc(arr);
        UtilityClass.printArray(arr);
        Object o = new Object();

    }
    public static int[] bubbleSortArrayInAsc(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<(arr.length-1) - i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSortArrayInDsc(int[] arr){
        System.out.println("Before Rotation => ");
        UtilityClass.printArray(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            Boolean flag = false;
            for(int j=0;j<(arr.length-1) - i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
            System.out.println("After "+(i+1)+" Rotation");
            UtilityClass.printArray(arr);
            System.out.println();
        }
        return arr;
    }

}
