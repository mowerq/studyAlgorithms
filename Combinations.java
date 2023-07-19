import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        int[] arr = {5,2,3,4};
        findAllSubarrays(arr);
    }

    public static void findAllSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubarrays(arr, 0, new ArrayList<>(), result);

        for (List<Integer> subarray : result) {
            for (int num : subarray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void generateSubarrays(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            if (!current.isEmpty()) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        current.add(arr[index]);
        generateSubarrays(arr, index + 1, current, result);

        current.remove(current.size() - 1);
        generateSubarrays(arr, index + 1, current, result);
    }
}
