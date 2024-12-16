#include <bits/stdc++.h>
using namespace std;

class DisjointSet
{
    public:

    vector<int> rank, parent, size;
    DisjointSet(int n)
    {
        rank.resize(n + 1, 0);
        parent.resize(n + 1);
        size.resize(n + 1);

        for (int i = 0; i <= n; i++)
        {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int findUltimateParent(int node)
    {
        if (node == parent[node])
            return node;
        return parent[node] = findUltimateParent(parent[node]);
    }

    void unionByRank(int u, int v)
    {
        int ultimateParent_U = findUltimateParent(u);
        int ultimateParent_V = findUltimateParent(v);

        if (ultimateParent_U == ultimateParent_V) return;

        if (rank[ultimateParent_U] < rank[ultimateParent_V]) parent[ultimateParent_U] = ultimateParent_V;

        else if (rank[ultimateParent_U] > rank[ultimateParent_V]) parent[ultimateParent_V] = ultimateParent_U;
        
        else
        {
            parent[ultimateParent_V] = ultimateParent_U;
            rank[ultimateParent_U]++;
        }
    }

    void unionBySize(int u, int v)
    {
        int ultimateParent_U = findUltimateParent(u);
        int ultimateParent_V = findUltimateParent(v);

        if (ultimateParent_U == ultimateParent_V) return;

        if (size[ultimateParent_U] < size[ultimateParent_V])
        {
            parent[ultimateParent_U] = ultimateParent_V;
            size[ultimateParent_V] += size[ultimateParent_U];
        }
        
        else
        {
            parent[ultimateParent_V] = ultimateParent_U;
            size[ultimateParent_U] += size[ultimateParent_V];
        }
    }
};

int main()
{
    DisjointSet ds(7);
    // ds.unionByRank(1, 2);
    // ds.unionByRank(2, 3);
    // ds.unionByRank(4, 5);
    // ds.unionByRank(6, 7);
    // ds.unionByRank(5, 6);
    // if(ds.findUltimateParent(3)==ds.findUltimateParent(7))
    // cout<<"Same\n";
    // else
    // cout<<"Not Same\n";
    // ds.unionByRank(3, 7);
    // if(ds.findUltimateParent(3)==ds.findUltimateParent(7))
    // cout<<"Same\n";
    // else
    // cout<<"Not Same\n";

    ds.unionBySize(1, 2);
    ds.unionBySize(2, 3);
    ds.unionBySize(4, 5);
    ds.unionBySize(6, 7);
    ds.unionBySize(5, 6);
    if (ds.findUltimateParent(3) == ds.findUltimateParent(7))
        cout << "Same\n";
    else
        cout << "Not Same\n";
    ds.unionBySize(3, 7);
    if (ds.findUltimateParent(3) == ds.findUltimateParent(7))
        cout << "Same\n";
    else
        cout << "Not Same\n";
    return 0;
}