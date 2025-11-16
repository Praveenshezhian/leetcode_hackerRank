import java.util.List;
// https://www.hackerrank.com/challenges/migratory-birds/problem


class MigratoryBirds{
    public static int migratoryBirds(List<Integer> arr) {
        int[] typeCount = new int[6]; // Bird types are 1 to 5

        for(int type : arr){
            typeCount[type]++;
        }

        int maxCount = 0;
        int resultType = 0;

        for(int i = 1; i <= 5; i++){
            if(typeCount[i] > maxCount){
                maxCount = typeCount[i];
                resultType = i;
            }
        }

        return resultType;
    }
}