class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int t:nums){
            set.add(t);
        }
        int i=0;
        while(i<=nums.length){
            if(!set.contains(i))
                return i;
            i++;
        }
        return -1;
    }
}