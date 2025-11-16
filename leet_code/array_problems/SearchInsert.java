class SearchInsert{
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int l=0,r=nums.length-1;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                res=mid;
                break;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        
        if(res==-1){
            res=l;
        }
        System.out.println("The target index to insert is: " + res);
    }
}