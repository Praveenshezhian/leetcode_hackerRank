class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9,l=0,r=nums.length-1;
        boolean found=false;
        while(l < r){
            int sum=nums[l]+nums[r];
            if(sum==target){
                found=true;
                break;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        if(found)
            System.out.println("Indices are: "+l+" "+r);
        else
            System.out.println("No such indices found");
    }
}