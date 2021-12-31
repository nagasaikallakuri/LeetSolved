class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength=Integer.MAX_VALUE;
        for(int ws=0,we=0,sum=0;we<nums.length;we++){
            sum+=nums[we];
             while(sum>=target){
                minlength=Math.min(minlength,we-ws+1); 
                sum-=nums[ws++];    
            }
        }
        return minlength==Integer.MAX_VALUE ? 0 : minlength;
    }
}