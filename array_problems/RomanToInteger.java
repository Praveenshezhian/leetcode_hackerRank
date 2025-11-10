class RomanToInteger {
    public static void main(String[] args) {
        int total = 0;
        int prevValue = 0;
        String s = "MCMXCIV"; 
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = getValue(ch);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }
        System.out.println("The integer value of the Roman numeral is: " + total);
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}