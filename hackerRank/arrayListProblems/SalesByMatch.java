/*
 * Problem Statement: Given an array of integers representing the color of each sock, 
 * determine how many pairs of socks with matching colors there are.
 *
 * Example:
 * Input: n = 7, ar = [1, 2, 1, 2, 1, 3, 2]
 * Output: 2
 * Explanation: There are two pairs of socks with color 1 and one pair with color 2.
 */

class SalesByMatch {
    static int sockMerchant(int n, int[] ar) {
        int[] colorCount = new int[101]; // Assuming colors are in the range 0-100
        for (int color : ar) {
            colorCount[color]++;
        }

        int pairs = 0;
        for (int count : colorCount) {
            pairs += count / 2;
        }

        return pairs;
    }
}