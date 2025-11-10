class sqrt{
    public static void main(String[] args) {
        int number = 16; 
        int l=0;
        int r=number;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int midSqr=mid*mid;
            if(midSqr==number)
            {
                res=mid;
                break;
            }
            else if(midSqr<number){
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        
        
        System.out.println("The square root of " + number + " is: " + res);
    }
}   