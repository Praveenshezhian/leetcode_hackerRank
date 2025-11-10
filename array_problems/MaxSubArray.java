class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max=arr[0],sum=0;
        for(int i=1;i<arr.length;i++){
            if(sum<0)
                sum=0;
            sum+=arr[i];
            max=Math.max(sum,max);
        }
        System.out.println("Maximum Subarray Sum is: "+max);
    }
}