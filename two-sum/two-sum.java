class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> resmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(resmap.containsKey(comp))
                return new int[]{resmap.get(comp),i};
            resmap.put(nums[i],i);
        }
       throw new IllegalArgumentException("no match found");  
    }
}