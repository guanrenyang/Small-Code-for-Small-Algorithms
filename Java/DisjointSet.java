class UnionFind {
    private int count; // Number of connected components
    private int[] parent; // `parent[i] is the parent of node i
    private int[] size; // Number of nodes in a connected components

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        size = new int[n];
        for(int i=0;i<n;++i){
            parent[i] = i; // create self-loop of root
            size[i] = 1;
        }
    }
    
    // connect node p and node q
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ){
            return ;
        }
        
        //link the smaller tree under the larger tree
        if(size[rootP]>size[rootQ]){
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        } else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }

    // judge the connectivity of node p and q
    public boolean connected(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }
    private int find(int x){
        while(parent[x] != x){
            // path compress
            parent[x] = parent[parent[x]];
            x = parent[x]; // iterate
        }
        return x;
    }
    // return the number of connected components
    public int count(){
        return count;
    }
}