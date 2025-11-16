import java.util.List;
class BirthdayCakeCandles{
    public static int birthdayCakeCandles(List<Integer> candles){
        int maxHeight = Integer.MIN_VALUE;
        int count = 0;

        for(int height : candles){
            if(height > maxHeight){
                maxHeight = height;
                count = 1;
            } else if(height == maxHeight){
                count++;
            }
        }

        return count;
    }
}