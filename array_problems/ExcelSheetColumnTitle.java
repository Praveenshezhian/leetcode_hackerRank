class ExcelSheetColumnTitle{
    private static  String numberToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-indexing
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            sb.append(ch);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    private static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberToTitle(67));
        System.out.println(titleToNumber("CN"));
    }

}