class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set= new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
        set.add(0);
        queue.offer(0);
        while(!queue.isEmpty()){
            int curr=queue.remove();
            List<Integer> list=new LinkedList<>();
            list=rooms.get(curr);
            for(int t:list)
                if(set.add(t))
                    queue.offer(t);
        }
        return set.size()==rooms.size();
    }
}