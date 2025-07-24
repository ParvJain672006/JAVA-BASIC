import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        // 1. Slice (using Arrays.copyOfRange)
        int[] arr1 = {2, 3, 4};
        int[] slice = Arrays.copyOfRange(arr1, 1, 3);
        System.out.println("Slice: " + Arrays.toString(slice));

        // 2. Splice (using ArrayList for dynamic operations)
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.set(1, 9); // Replace element at index 1 with 9
        System.out.println("Splice: " + list);

        // 3. ForEach
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("ForEach:");
        for (int x : arr2) {
            System.out.println(x);
        }

        // 4. Map (using stream)
        int[] arr3 = {1, 2, 3};
        int[] mapped = Arrays.stream(arr3)
                           .map(x -> x * 2)
                           .toArray();
        System.out.println("Map: " + Arrays.toString(mapped));

        // 5. Filter (using stream)
        int[] arr4 = {1, 2, 3};
        int[] filtered = Arrays.stream(arr4)
                             .filter(x -> x > 1)
                             .toArray();
        System.out.println("Filter: " + Arrays.toString(filtered));

        // 6. Reduce (using stream)
        int[] arr5 = {1, 2, 3};
        int sum = Arrays.stream(arr5)
                      .reduce(0, (acc, x) -> acc + x);
        System.out.println("Reduce: " + sum);

        // 7. Sort
        int[] arr6 = {3, 10, 1, 2, 10};
        Arrays.sort(arr6);
        System.out.println("Sort: " + Arrays.toString(arr6));

        // 8. Reverse
        int[] arr7 = {1, 2, 3};
        for (int i = 0; i < arr7.length / 2; i++) {
            int temp = arr7[i];
            arr7[i] = arr7[arr7.length - 1 - i];
            arr7[arr7.length - 1 - i] = temp;
        }
        System.out.println("Reverse: " + Arrays.toString(arr7));
    }
} 