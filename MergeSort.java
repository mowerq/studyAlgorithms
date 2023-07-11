import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {

    public static int[] mergeSort(int[] myList){
        if (myList.length == 1) {
            return myList;
        }

        int[] first_half = Arrays.copyOfRange(myList, 0, myList.length / 2);
        int[] second_half = Arrays.copyOfRange(myList, myList.length/2, myList.length);

        first_half = mergeSort(first_half);
        second_half = mergeSort(second_half);

        return merge(first_half, second_half);
    };

    public static int[] merge(int[] first_half, int[] second_half){
        int index_f = 0, index_s = 0;
        int[] mergedArray = new int[first_half.length + second_half.length];
        while (index_f < first_half.length && index_s < second_half.length){
            if (first_half[index_f] < second_half[index_s]) {
                mergedArray[index_f+index_s] = first_half[index_f];
                index_f++; 
            }else {
                mergedArray[index_f+index_s] = second_half[index_s];
                index_s++;
            }
        }
        while(index_s < second_half.length){
            mergedArray[index_f+index_s] = second_half[index_s];
            index_s++;
        }
        while(index_f < first_half.length){
            mergedArray[index_f+index_s] = first_half[index_f];
            index_f++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {

        int[] myList = {6,7,3,5,4,2,1};
        System.out.println(Arrays.toString(mergeSort(myList)));
        
        
    }
}