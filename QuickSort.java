import java.util.Arrays;
import java.io.File;
import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] myArray, int low, int high){
        if (low < high) {
            int pivot = partition(myArray, low, high);
            quickSort(myArray, low, pivot - 1);
            quickSort(myArray, pivot, high);
        }
    }

    public static int partition(int[] myArray, int low, int high){
        int pivot = myArray[low];
        while (low <= high) {
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
        try {
            File myFile = new File("RandomInteger10.txt");
            Scanner myReader = new Scanner(myFile);
            int[] myArray = Arrays.stream(myReader.next().split(",")).mapToInt(Integer::parseInt).toArray();
            System.out.println(Arrays.toString(myArray));
            quickSort(myArray, 0, myArray.length - 1);
            System.out.println(Arrays.toString(myArray));
            myReader.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
}
