import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Diagonal Difference Problem
//https://www.hackerrank.com/challenges/diagonal-difference/problem
class DiagonalDifference{
    public static int diagonalDifference(List<List<Integer>> arr){
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = arr.size();

        for(int i = 0; i < n; i++){
            primaryDiagonalSum += arr.get(i).get(i);
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(11, 2, 4));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(10, 8, -12));

        int result = diagonalDifference(arr);
        System.out.println("Diagonal Difference: " + result); // Output: 15
    }
}