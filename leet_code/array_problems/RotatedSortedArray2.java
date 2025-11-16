class RotatedSortedArray2{
    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        int target=0;
        int l=0,r=arr.length-1;
        boolean found=false;
        while(l<=r){
            int mid =l+(r-l)/2;
            if(arr[mid]==target){
                found=true;
                break;
            }
            if(arr[mid]==arr[l] && arr[mid]==arr[r]){
                l++;
                r--;
            }
            else if(arr[l]<=arr[mid]){
                if(arr[l]<= target && target<arr[mid])
                    r=mid-1;
                else
                    l=mid+1;
            }else{
                if(arr[mid]<target && arr[r]>=target)
                    l=mid+1;
                else
                    r=mid-1;
            }
        }
        System.out.println((found)?"Target found":"Target not found");
    }
}