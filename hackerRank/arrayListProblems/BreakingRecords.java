import java.util.ArrayList;
import java.util.List;
// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
class BreakingRecords{
    public static List<Integer> breakingRecords(List<Integer> scores){
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;

        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) > max){
                max = scores.get(i);
                maxCount++;
            } else if(scores.get(i) < min){
                min = scores.get(i);
                minCount++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}