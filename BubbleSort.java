import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] myArray){
        boolean finished = false;
        int lastUnsorted = myArray.length - 1;
        while(!finished){
            finished = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (myArray[i] > myArray[i + 1]){
                    int temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                    finished = false;
                }
            }
            lastUnsorted--;
        }
    }
    public static void main(String[] args) {

        try {
            File myFile = new File("RandomInteger10.txt");
            Scanner myReader = new Scanner(myFile);
            int[] myArray = Arrays.stream(myReader.next().split(",")).mapToInt(Integer::parseInt).toArray();
            System.out.println(Arrays.toString(myArray));
            bubbleSort(myArray);
            System.out.println(Arrays.toString(myArray));
            myReader.close();
        } catch (Exception e) {
            // TODO: handle exception
        }


        
    }
}
