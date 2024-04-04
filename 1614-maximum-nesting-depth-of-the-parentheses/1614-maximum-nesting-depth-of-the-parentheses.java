class Solution {
    public int maxDepth(String s) {
        Stack<Character> st= new Stack<>();
        int res=0,count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }else if(c==')')
                count--;
            res=Math.max(res,count);
        }
        return res;
    }
}