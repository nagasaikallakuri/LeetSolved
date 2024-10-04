class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack();
        for(char c:s.toCharArray()){
            if(c=='('){
               st.push(')'); 
            }else if(c=='['){
                st.push(']');
            }else if(c=='{'){
                st.push('}');
            }else{
                if(st.isEmpty() || st.peek()!=c)
                    return false;
                if(!st.isEmpty()&&c==st.peek()){
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}