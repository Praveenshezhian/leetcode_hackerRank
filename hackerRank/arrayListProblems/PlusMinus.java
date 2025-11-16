import java.util.List;
// https://www.hackerrank.com/challenges/plus-minus/problem

class PlusMinus{
    public static void plusMinus(List<Integer> arr){
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int totalCount = arr.size();

        for(int num : arr){
            if(num > 0){
                positiveCount++;
            } else if(num < 0){
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("%.6f%n", (double) positiveCount / totalCount);
        System.out.printf("%.6f%n", (double) negativeCount / totalCount);
        System.out.printf("%.6f%n", (double) zeroCount / totalCount); // Print ratios with 6 decimal places        
    }
}