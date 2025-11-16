import java.util.ArrayList;
import java.util.List;  

//https://www.hackerrank.com/challenges/grading/problem
class GradingStudent {
    public static List<Integer> gradingStudents(List<Integer> grades){
        List <Integer> res=new ArrayList<>();
        for(int temp : grades){
            if(temp%5 >2 && temp > 35)
                temp+= 5-temp%5;
            res.add(temp);
        }
        return res;
    }
}