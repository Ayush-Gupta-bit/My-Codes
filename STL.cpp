
#include<bits/stdc++.h>
using namespace std;

void explainPair() {

    pair<int, int> p={1,3};
    cout<<p.first<<" "<<p.second<<"\n";

    pair<int, pair<int, int>> pq ={1, {3,4}};
    cout<<pq.first<<" "<<pq.second.second<<" "<<pq.second.first<<"\n";

    pair<int, int> arr[]={{1,2},{2,5},{4,6}};
    cout<<arr[1].second<<"\n";
}

void explainVector() {

    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);
    v.push_back(3);
    v.push_back(4);
    v.push_back(5);
    v.push_back(6);
    v.push_back(7);
    v.push_back(8);
    v.push_back(9);

    vector<pair<int, int>> vec;
    vec.push_back({1,2});
    vec.emplace_back(1,2);

    vector<int> x(5,100);
    vector<int> y(5);

    vector<int> v2(v); // Copy of vector v 

    vector<int>:: iterator it=v.begin();
    it++;
    cout<<*(it)<<"\n";
    it=it+2;
    cout<<*(it)<<"\n";

    vector<int>:: iterator it2=v.end();
    vector<int>:: iterator it3=v.rbegin();
    vector<int>:: iterator it4=v.rend();

    cout<<v[0]<<" "<< v.at(0)<<"\n";
    cout<<v.back()<<"\n";

    for(vector<int>:: iterator it=v.begin(); it!=v.end(); it++) 
    cout<<*(it)<<" ";
    cout<<"\n";

    for(auto it=v.begin(); it!=v.end(); it++) 
    cout<<*(it)<<" ";
    cout<<"\n";

    for(auto it: v) 
    cout<<it<<" ";
    cout<<"\n";

    v.erase(v.begin()+1); // v={1,3,4,5,6,7,8,9}
    v.erase(v.begin()+2, v.begin()+4); // v={1,3,6,7,8,9}

    vector<int>vx(2,100); // vx={100, 100}
    vx.insert(vx.begin(), 300); // vx={300, 100, 100}
    vx.insert(vx.begin()+1, 2,10); // vx={300, 10, 10, 100, 100}

    vector<int> copy(2, 50); // copy={50, 50}
    vx.insert(vx.begin(), copy.begin(), copy.end()); // vx={50, 50, 300, 10, 10, 100, 100}

    vx.pop_back();

    // v={10, 20} and v2={30, 40}
    v.swap(v2); 
    // v={30, 40} and v2={10, 20}

    v.clear(); // erases the entire vector

    cout<<v.empty()<<"\n";
}

void explainList() {

    list<int> ls;

    ls.push_back(2); // ls={2}
    ls.emplace_back(4); // ls={2, 4}

    ls.push_front(5); // ls={5, 2, 4}
    ls.emplace_front(6); // ls={6, 5, 2, 4}

    //Rest functions are same as vector - begin, end, rbegin, rend, clear, insert, size, swap
}

void explainDeque() {

    deque<int> dq;
    dq.push_back(1);
    dq.emplace_back(2);
    dq.push_front(4);
    dq.emplace_front(3);

    dq.pop_back();
    dq.pop_front();

    dq.back();
    dq.front();

    //Rest functions are same as vector - begin, end, rbegin, rend, clear, insert, size, swap
}

void explainStack() {

    stack<int> st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.emplace(6);

    cout<<st.top()<<"\n";

    st.pop();

    cout<<st.top()<<" "<<st.size()<<" "<<st.empty()<<"\n";

    stack<int> st1, st2;
    st1.swap(st2);

    // All operations have O(1) time complexity
}

void explainQueue() {

    queue<int> q;
    q.push(1);
    q.push(2);
    q.push(3);
    q.emplace(4);

    q.back()+=5;

    cout<<q.back()<<" "<<q.front()<<" ";

    q.pop();

    cout<<q.front()<<" "<<q.size()<<" "<<q.empty()<<"\n";

    // swap is same as that in stack
    // All operations have O(1) time complexity
}

void explainPriorityQueue() {

    priority_queue<int> pq; // Max-heap
    pq.push(5); // {5}
    pq.push(2); // {5, 2}
    pq.push(8); // {8, 5, 2}
    pq.emplace(10); // {10, 8, 5, 2}

    cout<<pq.top(); // 10

    pq.pop(); // 10 is popped out. Time Complexity O(logn)

    cout<<" "<<pq.top(); // 8 Time Complexity O(1)

    priority_queue<int, vector<int>, greater<int>> pq; // Min-heap
    pq.push(5); // {5}  Time Complexity O(logn)
    pq.push(2); // {2, 5}
    pq.push(8); // {2, 5, 8}
    pq.emplace(10); // {2, 5, 8, 10}

    pq.pop(); // 2 is popped out

    cout<<" "<<pq.top()<<"\n"; // 2    
    
}

void explainSet() {

    set<int> st; // stores everything in sorted order and unique elements
    st.insert(1); // {1}
    st.emplace(2); // {1,2}
    st.insert(2); // {1,2}
    st.insert(4); // {1,2,4}
    st.insert(3); // {1,2,3,4}
    st.insert(5); // {1,2,3,4,5}

    /* Functionality of insert in vector can be used also, that only enhances efficiency.
    begin(), end(), rbegin(), rend(), size(), empty() and swap() are same as those of above.*/

    auto it=st.find(3); // returns an iterator pointing to 3
    auto it2=st.find(6); // returns an iterator pointing to set.end()
    
    st.erase(5); // erases 5 and maintains the sorted order, takes logarithmic time

    int cnt=st.count(1);
    
    auto it3=st.find(3);
    auto it6=st.find(5); // takes logarithmic time
    st.erase(it3, it6); // takes logarithmic time

    auto it4=st.lower_bound(2); // takes logarithmic time
    auto it5=st.upper_bound(3); // takes logarithmic time
}

void explainMultiset() {

    multiset<int> ms; // everything is same as set, only difference is that multiset can store duplicate elements also
    ms.insert(1); // {1}
    ms.insert(2); // {1,2}
    ms.insert(1); // {1,2,1}
    ms.insert(7); //{1,2,1,7}
    ms.insert(9); //{1,2,1,7,9}

    ms.erase(1); // all 1s erased

    int cnt=ms.count(1);

    ms.erase(ms.find(1)); // only single 1 erased;

    ms.erase(ms.find(1), ms.find(1)+2); 

    // rest all functions are same as set
}

void explainUnorderedSet() {

    unordered_set<int> st; 
    // lower_bound and upper_bound functions are not there
    // rest all functions are same as set
    // elements are not stored in particular order
    // it has better time complexity than set in most cases, except when there is a collision O(n)
}

void explainMap() {
    map<int, int> mp;
    map<int, pair<int, int>> mp2;
    map<pair<int, int>, int> mp3;

    mp[1]=2; // [{1,2}]
    mp.emplace(3, 1); // [{1,2}, {3,1}] 
    mp.insert({2,3}); // [{1,2}, {2, 3}, {3, 1}]  stores elements in sorted order

    mp3[{2,3}]=10;

    for(auto it: mp) 
    cout<<it.first<<" "<<it.second<<"\n";

    cout<<mp[1]<<"\n"<<mp[5]<<"\n"; // for mp[5], prints 0 -> null value

    auto it2=mp.find(3);
    cout<<*(it2).second;

    auto it3=mp.find(5); // returns iterator at mp.end()
    auto it4=mp.lower_bound(2);
    auto it5=mp.upper_bound(3);
    // erase, swap, size, empty functions are same as above
}

void explainMultimap() {

    // everything is same as map, only it can store multiple duplicate keys
    // only mp[keys] cannot be used here
}

void explainUnorderedMap() {

    // same as set and unordered set difference
}

static bool comp(pair<int, int> p1, pair<int, int> p2) {

    if(p1.second<p2.second) 
    return true;
    else if(p1.second==p2.second) {
        if(p1.first>p2.first) 
        return true;
    }
    return false;
}

void explainExtra() {
    int a[3];
    int n=3;
    vector<int> v;

    sort(a, a+n); // a is an array and n is the size of array a
    sort(v.begin(), v.end());
    sort(a+2, a+5);

    pair<int, int> b[]={{1,2}, {2,1}, {4,1}}; // sort it according to second element, if second element is same, then sort it according to first element in descending order
    sort(b, b+n, comp);

    int num=7; 
    int cnt=__builtin_popcount(num); // counts the number of set bits in integer
    long long num=132342355543534;
    int cnt=__builtin_popcountll(2); // counts the number of set bits in long integer

    string s="gsaasf";
    transform(s.begin(), s.end(), s.begin(), ::toupper); // converting string to lower case
    sort(s.begin(), s.end()); // to get all possible permutations, the string must be sorted
    
    do {
        cout<<s<<" ";
    } while(next_permutation(s.begin(), s.end())); // prints all possible permutations of the string

    int maxe=*max_element(a, a+n); // returns maximum element in the array
    int mine=*min_element(a, a+n); // returns minimum element in the array
    int sum=accumulate(v.begin(), v.end(), 0); // 0 is the initial sum. It returns initial sum + sum of all elements of the vector
    int c=count(v.begin(), v.end(), 3); // returns the frequency of element 3 in the vector

    reverse(v.begin(), v.end()); // reverses the vector
    string s="Ayush Gupta";
    reverse(s.begin(), s.end());

    // lambda functions
    auto sum=[](int x, int y) { return x+y; }; // Now sum is a function
    cout<<sum(2,3);

    vector<int> v={2,1,4,1,342,1,-1432};
    cout<<all_of(v.begin(), v.end(), [](int x) { return x>0; });
    cout<<any_of(v.begin(), v.end(), [](int x) { return x>0; });
    cout<<none_of(v.begin(),v.end(), [](int x) { return x>0; });
}