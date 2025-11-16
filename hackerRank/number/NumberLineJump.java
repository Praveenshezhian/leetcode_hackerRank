class NumberLineJump {

        // n * v1 - n * v2 = x2 - x1
        // n * (v1 - v2) = x2 - x1
        // n = (x2 - x1) / (v1 - v2)

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO";
        }
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }


    public static void main(String[] args) {
        // Example usage:
        System.out.println(kangaroo(0, 3, 4, 2)); // Output: YES
        System.out.println(kangaroo(0, 2, 5, 3)); // Output: NO
    }
}