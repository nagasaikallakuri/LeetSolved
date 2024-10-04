class Solution {
    public int reverse(int x) {
        int t=1;
        if(x<0){
            t=-1;
            x=t*x;
        }
        int rev=0;
        while(x>0){
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && x%10 > 7)) {
                return 0; // Overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x%10 < -8)) {
                return 0; // Underflow
            }
            rev=rev*10+x%10;
            
            x/=10;
        }
        return t*rev;
        
    }
}