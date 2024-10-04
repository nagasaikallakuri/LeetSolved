class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> check= new HashMap<>();
        int[] res= new int[k];
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int t:nums){
            check.put(t,check.getOrDefault(t,0)+1);
        }
        for(Map.Entry<Integer,Integer> m: check.entrySet()){
            pq.offer(m);
        }
        int i=0;
        while(k-->0){
            res[i++]=pq.poll().getKey();
        }
        return res;
    }
}