class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        UF uf= new UF(edges.length);
        for(int[] e:edges){
            if(uf.isConnected(e[0]-1,e[1]-1))
                return e;
            else
                uf.union(e[0]-1,e[1]-1);
        }
        return new int[]{};
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
        }else{
           size[qRoot]+=size[pRoot];
            id[pRoot]=qRoot; 
        }
    }
    public int[] getIds(){
        int[] roots=new int[id.length];
        for(int i=0;i<id.length;i++)
            roots[i]=getRoot(i);
        return roots;
    }
    public boolean isConnected(int p, int q){
        int pRoot=getRoot(p);
        int qRoot=getRoot(q);
        return pRoot==qRoot;
    }
    public int getRoot(int p){
        while(id[p]!=p)
            p=id[id[p]];
        return p;
    }
}