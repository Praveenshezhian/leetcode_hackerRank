
import java.util.Arrays;

class TwoSum2{
    public static void main(String[] args) {
        int numbers[]= {2,7,11,15};
        int target=9;
        int r=numbers.length-1;
        int l=0;
        int arr[]=new int[2];
        while(l<r)
        {
            if(numbers[l]+numbers[r]<target)
                l++;
            else if(numbers[l]+numbers[r]>target)
                r--;
            else
            {
                break;
            }
        }
        arr[0]=l+1;
        arr[1]=r+1;
        System.err.println(Arrays.toString(arr));
    }
}