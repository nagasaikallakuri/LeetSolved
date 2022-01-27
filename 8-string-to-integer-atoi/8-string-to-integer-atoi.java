class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        if(len==0)
            return 0;
        int index=0;
        boolean isNegetive=false;
        while(index<len && s.charAt(index)==' ')
            ++index;
        if(index<len){
        if(s.charAt(index)=='-'){
            isNegetive=true;
            index++;
        }
        else if(s.charAt(index)=='+')
            index++;
        }
        int res=0;
        while(index<len && isDigit(s.charAt(index))){
            int cur=s.charAt(index)-'0';
            if(res> Integer.MAX_VALUE/10 ||(res == Integer.MAX_VALUE/10 && cur>7))
                return isNegetive? Integer.MIN_VALUE :Integer.MAX_VALUE;
            res=res*10+cur;
            index++;
        }
        return isNegetive?-res:res;
    }
    private boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';
  }
}