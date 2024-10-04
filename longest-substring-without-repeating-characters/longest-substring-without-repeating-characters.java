class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Set<Character> check= new HashSet<>();
        for(int left=0,right=0;right<s.length();right++){
            char curr=s.charAt(right);
            while(check.contains(curr)){
                check.remove(s.charAt(left++));
            }
            check.add(curr);
            max=Math.max(max,check.size());
        }
        
        return max;
    }
}