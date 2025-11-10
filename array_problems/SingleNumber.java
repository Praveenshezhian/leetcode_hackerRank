public class SingleNumber{
    public static void main(String[] args) {
        int result = 0;
        int nums[] = {4, 1, 2, 1, 2};
        for (int num : nums) {
            result ^= num;
        }
        System.out.println("The single number is: " + result);
    }   
}