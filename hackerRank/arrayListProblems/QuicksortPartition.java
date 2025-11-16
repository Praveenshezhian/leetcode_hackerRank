import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/quicksort1/problem
class QuicksortPartition {
    static int[] quickSortPartition(int[] arr) {
        int pivot = arr[0];
        int[] less = new int[arr.length];
        int[] greater = new int[arr.length];
        int lessCount = 0;
        int greaterCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) {
                less[lessCount++] = arr[i];
            } else {
                greater[greaterCount++] = arr[i];
            }
        }

        int[] result = new int[arr.length];
        System.arraycopy(less, 0, result, 0, lessCount);
        result[lessCount] = pivot;
        System.arraycopy(greater, 0, result, lessCount + 1, greaterCount);

        return result;
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                less.add(arr.get(i));
            } else {
                greater.add(arr.get(i));
            }
        }

        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(quickSort(less));
        sorted.add(pivot);
        sorted.addAll(quickSort(greater));

        return sorted;
    }
}