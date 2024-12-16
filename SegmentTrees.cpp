#include<bits/stdc++.h>
using namespace std;

class SegmentTree
{   
    vector<int> seg; 

    public:
    SegmentTree(int n)
    {
        seg.resize(4 * n + 1);
    }

    void build(int ind, int low, int high, int arr[])
    {
        if(low == high)
        {
            seg[ind] = arr[low];
            return;
        }

        int mid = low + (high - low) / 2;
        build(2 * ind + 1, low, mid, arr);
        build(2 * ind + 2, mid + 1, high, arr);
        seg[ind] = min(seg[2 * ind + 1], seg[2 * ind + 2]);
    }

    int query(int ind, int low, int high, int l, int r)
    {
        // No overlap -> l < r < low < high or low < high < l < r
        if(r < low || high < l) return INT_MAX;

        // Complete overlap -> l < low < high < r
        if(low >= l && high <= r) return seg[ind];

        int mid = low + (high - low) / 2;
        int left = query(2 * ind + 1, low , mid, l, r);
        int right = query(2 * ind + 2, mid + 1, high, l, r);

        return min(left, right);
    }

    void update(int ind, int low, int high, int i, int val) 
    {
        if(low == high) 
        {
            seg[ind] = val;
            return;
        }

        int mid = low + (high - low) / 2;
        if(i <= mid) update(2 * ind + 1, low, mid, i, val);
        else update(2 * ind + 2, mid + 1, high, i, val);

        seg[ind] = min(seg[2 * ind + 1], seg[2 * ind + 2]);
    }
};

void solve() 
{
    int n;
    cin>>n;

    int arr[n];
    for(int i = 0; i < n; i++) cin>>arr[i];

    SegmentTree seg(n);

    seg.build(0, 0, n - 1, arr);

    int q;
    cin>>q;

    while(q--) 
    {
        int type;
        cin>>type;

        if(type == 1)
        {
            int l, r;
            cin>>l>>r;

            cout<<seg.query(0, 0, n - 1, l, r)<<"\n";
        }

        else 
        {
            int i, val;
            cin>>i>>val;
            seg.update(0, 0, n - 1, i, val);
            arr[i] = val;
        }
    }
}

int main() 
{
    solve();

    return 0;
}