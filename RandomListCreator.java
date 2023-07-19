import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RandomListCreator {
    public static void main(String[] args) {
        String myList5 = "", myList10 = "", myList1000 = "", myList100000 = "";

        Random random = new Random();

        for(int i = 0; i < 100000; i++){
            if (i < 5) {
                myList5 += random.nextInt(20) + ",";
            }
            if (i < 10) {
                myList10 += random.nextInt(50) + ",";
            }
            if (i < 1000) {
                myList1000 += random.nextInt(5000) + ",";
            }
            myList100000 += random.nextInt(400000) + ",";
        }


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("RandomInteger5.txt"));
            writer.write(myList5);
            writer.close();
            writer = new BufferedWriter(new FileWriter("RandomInteger10.txt"));
            writer.write(myList10);
            writer.close();
            writer = new BufferedWriter(new FileWriter("RandomInteger1000.txt"));
            writer.write(myList1000);
            writer.close();
            writer = new BufferedWriter(new FileWriter("RandomInteger100000.txt"));
            writer.write(myList100000);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
