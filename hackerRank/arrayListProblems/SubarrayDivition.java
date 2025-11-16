import java.util.List;
// https://www.hackerrank.com/challenges/the-birthday-bar/problem

class SubarrayDivition {
    public static int birthday(List<Integer> s, int d, int m){
        int currentSum = 0;
        int count=0;
        for (int k = 0; k < m; k++) {
            currentSum += s.get(k);
        }
        if (currentSum == d)count++;

        for (int i = m; i < s.size(); i++) {
            currentSum += s.get(i) - s.get(i - m);
            if (currentSum == d) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 2, 1, 3, 2), 3, 2)); // Output: 2
        System.out.println(birthday(List.of(1, 1, 1, 1, 1, 1), 3, 2)); // Output: 0
        System.out.println(birthday(List.of(4), 4, 1)); // Output: 1
    }
}