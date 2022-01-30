#include<bits/stdc++.h>
using namespace std;
class DisjointSet
{
private:
    int count;
    vector<int> parent;
    vector<int> size;
public:
    DisjointSet(int n){
        parent.resize(n);
        size.resize(n);
        
        count=n;
        for(int i=0;i<n;++i){
            parent[i] = i;
            size[i] = 1;
        }
    }
    void Union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);
        if(size[rootP]>size[rootQ]){
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        } else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }
    bool Connected(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }
    int Count(){
        return count;
    }
private: 
    int find(int x){
        while(parent[x]!=x){
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
};