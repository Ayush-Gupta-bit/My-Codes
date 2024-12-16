// Ayush Gupta

#include <iostream>
#include <bits/stdc++.h>

using namespace std;
 
// Speed
#define Code ios_base::sync_with_stdio(false);
#define By cin.tie(NULL);
#define Ayush cout.tie(NULL);
 
// Aliases
using ll = long long;
using lld = long double;
using ull = unsigned long long;
 
// Constants
const lld pi = 3.141592653589793238;
const ll INF = LLONG_MAX;
const ll mod = 1e9 + 7;
const int inf = INT_MAX;
 
// TypeDef
typedef pair<ll, ll> pll;
typedef vector<ll> vll;
typedef vector<int> vit;
typedef vector<pll> vpll;
typedef vector<string> vs;
typedef unordered_map<ll, ll> umll;
typedef map<ll, ll> mll;
 
// Macros
#define ff first
#define ss second
#define p_b push_back
#define p_p pop_back
#define mp make_pair
#define For(i, n) for (int i = 0; i < n; i++)
#define PY cout << "YES\n";
#define PM cout << "-1\n";
#define PN cout << "NO\n";
#define vr(v) v.begin(), v.end()
#define rv(v) v.end(), v.begin()
#define sortv(v) sort(v.begin(), v.end())
#define reversev(v) reverse(v.begin(), v.end())
#define reversevIdx(v, i, j) reverse(v.begin() + i, v.begin() + j)
 
// Mathematical functions
ll gcd(ll a, ll b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
} // gcd

ll lcm(ll a, ll b) { return (a / gcd(a, b) * b); }

ll moduloMultiplication(ll a, ll b, ll mod)
{
    ll res = 0;
    a %= mod;
    while (b)
    {
        if (b & 1)
            res = (res + a) % mod;
        b >>= 1;
    }
    return res;
}

ll powermod(ll x, ll y, ll p)
{
    ll res = 1;
    x = x % p;
    if (x == 0)
        return 0;
    while (y > 0)
    {
        if (y & 1)
            res = (res * x) % p;
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}
 
// Graph-dfs
//  bool gone[MN];
//  vector<int> adj[MN];
//  void dfs(int loc){
//      gone[loc]=true;
//      for(auto x:adj[loc])if(!gone[x])dfs(x);
//  }
 
// Sorting
bool sorta(const pair<int, int> &a, const pair<int, int> &b) { return (a.second < b.second); }
bool sortd(const pair<int, int> &a, const pair<int, int> &b) { return (a.second > b.second); }
 
// Bits
string decToBinary(int n)
{
    string s = "";
    int i = 0;
    while (n > 0)
    {
        s = to_string(n % 2) + s;
        n = n / 2;
        i++;
    }
    return s;
}

ll binaryToDecimal(string n)
{
    string num = n;
    ll dec_value = 0;
    int base = 1;
    int len = num.length();
    for (int i = len - 1; i >= 0; i--)
    {
        if (num[i] == '1')
            dec_value += base;
        base = base * 2;
    }
    return dec_value;
}
 
// Check
bool isPrime(ll n)
{
    if (n <= 1)
        return false;
    if (n <= 3)
        return true;
    if (n % 2 == 0 || n % 3 == 0)
        return false;
    for (int i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    return true;
}

bool isPowerOfTwo(int n)
{
    if (n == 0)
        return false;
    return (ceil(log2(n)) == floor(log2(n)));
}

bool isPerfectSquare(ll x)
{
    if (x >= 0)
    {
        ll sr = sqrt(x);
        return (sr * sr == x);
    }
    return false;
}
 
vector<int> primeNumber(int l)
{
    vector<bool> isprime(l + 1, true);
    vector<int> prime;
 
    isprime[0] = isprime[1] = false;
 
    for (int i = 2; i <= l; ++i)
    {
        if (isprime[i])
        {
            prime.push_back(i);
            for (int j = i * 2; j <= l; j += i)
            {
                isprime[j] = false;
            }
        }
    }
 
    return prime;
}

bool isSubstring(const std::string &s1, const std::string &s2)
{
    // Use the find function to search for s1 in s2
    return s2.find(s1) != std::string::npos;
}

int countdigit(int n)
{
    int count = 0;
    while (n > 0)
    {
        count++;
        n /= 10;
    }
    return count;
}

ll sumofdigit(ll n)
{
    ll sum = 0;
    while (n > 0)
    {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

bool large(ll n)
{
    while (n > 0)
    {
        if (n % 10 < 5)
            return false;
        n /= 10;
    }
    return true;
}

ll reverse(ll n)
{
    ll r = 0;
    while (n > 0)
    {
        r *= 10;
        r += n % 10;
        n /= 10;
    }
    return r;
}

ll query(ll a) {
    cout<<"? "<<a<<endl;
    cout.flush();
    ll ans;
    cin>>ans;
    return ans;
}

struct info
{
    ll open, close, full;

    public :

    info()
    {
        open = 0;
        close = 0;
        full = 0;
    }

    info(ll _open, ll _close, ll _full)
    {
        open = _open;
        close = _close;
        full = _full;
    }
};

info merge(info left, info right) 
{
    info ans = info(0, 0, 0);
    ans.full = left.full + right.full + min(left.open, right.close);
    ans.open = left.open + right.open - min(left.open, right.close);
    ans.close = left.close + right.close - min(left.open, right.close);

    return ans;
}

info query(ll ind, ll low, ll high, ll l, ll r, info seg[])
{
    if(r < low || l > high) return info();
    if(low >= l && high <= r) return seg[ind];

    ll mid = low + (high - low) / 2;
    info left = query(2 * ind + 1, low, mid, l, r, seg);
    info right = query(2 * ind + 2, mid + 1, high, l, r, seg);
    return merge(left, right);
}

void build(ll ind, ll low, ll high, string &s, info seg[])
{
    if(low == high)
    {
        seg[ind] = info(s[low] == '(', s[low] == ')', 0);
        return;
    }

    ll mid = low + (high - low) / 2;
    build(2 * ind + 1, low, mid, s, seg);
    build(2 * ind + 2, mid + 1, high, s, seg);
    seg[ind] = merge(seg[2 * ind + 1], seg[2 * ind + 2]);
}

void solve() 
{
    string s;
    cin>>s;
    ll q, n;
    cin>>q;
    n = s.size();

    info seg[4 * n];
    build(0, 0, n - 1, s, seg);

    while(q--)
    {
        ll l, r;
        cin>>l>>r;
        l--; 
        r--;

        cout<<query(0, 0, n - 1, l, r, seg).full * 2<<"\n";
    }

    // for(int i = 0; i < 4 * n; i++) 
    // cout<<seg[i].open<<" "<<seg[i].close<<" "<<seg[i].full<<"\n";
}
 
// Main
int main()
{
    Code By Ayush
    // ll t;
    // cin >> t;

    // while (t--)
    solve();
 
    return 0;
}
// End
