import java.util.Arrays;
class PlusOne{
    public static void main(String[] args) {
        int digits[] = {9, 9, 9};
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println("Result after plus one:");
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
        
        int newNumber[] = new int[n + 1];
        newNumber[0] = 1;
        System.out.println("Result after plus one:");
        System.out.println(Arrays.toString(newNumber));
    }
}