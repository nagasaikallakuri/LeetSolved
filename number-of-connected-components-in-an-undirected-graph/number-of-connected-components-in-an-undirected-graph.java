class Solution {
    public int countComponents(int n, int[][] edges) {
        UF uf= new UF(n);
        for(int[] e: edges){
            uf.union(e[0],e[1]);
        }
        int[] roots=uf.getIds();
        HashSet<Integer> set=new HashSet<>();
        for(int t:roots)
            set.add(t);
        return set.size();
    }
}
public class UF{
    int[] id;
    int[] size;
    public UF(int n){
        id=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
            size[i]=1;
        }
    }
    public void union(int p, int q){
        int pRoot=getRoot(p);
        int qRoot=getRoot(q);
        if(size[pRoot]>size[qRoot]){
            size[pRoot]+=size[qRoot];
            id[qRoot]=pRoot;
        }
        else{
            size[qRoot]+=size[pRoot];
            id[pRoot]=qRoot;
        }
    }
    public int[] getIds(){
        int[] roots= new int[id.length];
        for(int i=0;i<id.length;i++)
            roots[i]=getRoot(i);
        return roots;
    }
    public int getRoot(int p){
        while(p!=id[p])
            p=id[id[p]];
        return p;
    }
    public boolean isConnected(int p,int q){
        int pRoot=getRoot(p);
        int qRoot=getRoot(q);
        
        return pRoot==qRoot;
    }
}