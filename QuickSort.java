import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] myArray, int low, int high){
        System.out.println(1);
        if (low < high) {
            int pivot = partition(myArray, low, high);
            quickSort(myArray, low, pivot - 1);
            quickSort(myArray, pivot + 1, high);
        }
    }

    public static int partition(int[] myArray, int low, int high){
        int pivot = myArray[low];
        while (low <= high) {
            System.out.println(low + " - " + high);
            while (myArray[low] < pivot){
                low++;
            }
            while(myArray[high] > pivot){
                high--;
            }
            if (low <= high) {
                int temp = myArray[low];
                myArray[low] = myArray[high];
                myArray[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] myArray = {7,3,4,5,2,6,1};
        System.out.println(Arrays.toString(myArray));
        quickSort(myArray, 0, myArray.length - 1);
        System.out.println(Arrays.toString(myArray));
    }
}
