class SuperReducedString{
    public static void main(String[] args) {
        String s = "aaabccddd";
        String reducedString = superReducedString(s);
        System.out.println(reducedString);
    }
    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean foundPair;

        do {
            foundPair = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    foundPair = true;
                    break; // Restart scanning from the beginning
                }
            }
        } while (foundPair);

        return sb.length() == 0 ? "Empty String" : sb.toString();
    }
}