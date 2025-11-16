import java.util.List;
// https://www.hackerrank.com/challenges/bon-appetit/problem

class BillDivition{
     public static void bonAppetit(List<Integer> bill, int k, int b){
        int total = 0;
        for(int i = 0; i < bill.size(); i++){
            if(i != k){
                total += bill.get(i);
            }
        }
        int annaShare = total / 2;
        if(annaShare == b){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaShare);
        }
     }
}