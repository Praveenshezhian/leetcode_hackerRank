import java.util.ArrayList;
import java.util.List;
// https://www.hackerrank.com/challenges/compare-the-triplets/problem

class CompareTriplet{
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int aScore = 0;
        int bScore = 0;

        for(int i = 0; i < 3; i++){
            if(a.get(i) > b.get(i)){
                aScore++;
            } else if(a.get(i) < b.get(i)){
                bScore++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(aScore);
        result.add(bScore);
        return result;
    }
}