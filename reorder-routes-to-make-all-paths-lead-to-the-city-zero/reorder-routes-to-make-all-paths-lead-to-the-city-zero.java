class Solution {
    int count=0;
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> list=new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++)
            list.add(new ArrayList<Integer>());
        for(int[] c: connections){
            list.get(c[0]).add(c[1]);
            list.get(c[1]).add(-1*c[0]);
        }
        DFS(0,visited,list);
        return count;
    }
    public void DFS(int cur,boolean[] visited,List<List<Integer>> list){
        visited[cur]=true;
        for(int t:list.get(cur)){
            if(visited[Math.abs(t)]==false){
                if(t>0)
                    count++;
                DFS(Math.abs(t),visited,list);
            }
        }
    }
}