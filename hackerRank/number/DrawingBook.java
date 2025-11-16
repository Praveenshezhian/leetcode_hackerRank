
// https://www.hackerrank.com/challenges/drawing-book/problem
/* A teacher asks the class to open their books to a page number. 
A student can either start turning pages from the front of the book or from the back of the book. 
They always turn pages one at a time. When they open the book, page 1 is always on the right side:

When they flip page 1, they see pages 2 and 3. 
Each page except the last page will always be printed on both sides. 
The last page may only be printed on the front, given the length of the book.   */


class DrawingBook{
    static int pageCount(int n, int p) {
        // Write your code here
        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);
        return Math.min(fromFront, fromBack);
    }
    public static int pageCount2(int n, int p){
        int front = p / 2;
        int back;
        if (n % 2 == 0) 
            back = (n - p + 1) / 2;
         else  
            back = (n - p) / 2;
    
        return Math.min(front, back);
    } 
}