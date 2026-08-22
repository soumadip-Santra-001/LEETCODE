class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        while( n>0){
        int rem=n%10;
        sum+=rem;
        n=n/10;
        //return sum;
        }
        n=original;
        int product=1;
        while( n>0){
        int rem=n%10;
        product*=rem;
        n=n/10;
        //return product;
        }
        
        int add=sum+product;
        if(original%add==0){
            return true;
        }else{
            return false;
        }

        
    }
}