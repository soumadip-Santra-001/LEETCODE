class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reverse=0;
        while(x>0){
            int digit =x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        if(original==reverse){
            return true;//System.out.println(isPalindrome(x)); 
            //system.out.println("this is palinrome");
        }else  return false;//system.out.println("this is not palinrome");

        
    }
}