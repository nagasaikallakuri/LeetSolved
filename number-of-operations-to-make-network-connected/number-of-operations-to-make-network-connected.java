class Solution {
    public int makeConnected(int n, int[][] connections) {
        int count=0;
       UF uf=new UF(n);
        for(int[] c:connections){
            if(uf.isConnected(c[0],c[1]))
                count++;
            else
                uf.union(c[0],c[1]);
        }
        HashSet<Integer> set=new HashSet<>();
        int[] roots=uf.getIds();
        for(int t:roots)
            set.add(t);
        if(count>=set.size()-1)
            return set.size()-1;
        return -1;
    }
}
public class UF{
    int[] id;
    int[] size;
    public UF(int n){
        id=new int[n];
        size= new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
            size[i]=1;
        }
    }
    public void union(int p,int q){
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
        int[] roots=new int[id.length];
        for(int i=0;i<id.length;i++){
            roots[i]=getRoot(i);
        }
        return roots;
    }
    public int getRoot(int p){
        while(p!=id[p])
            p=id[id[p]];
        return p;
    }
    public boolean isConnected(int p, int q){
        int pRoot=getRoot(p);
        int qRoot=getRoot(q);
        
        return pRoot==qRoot;
    }
}