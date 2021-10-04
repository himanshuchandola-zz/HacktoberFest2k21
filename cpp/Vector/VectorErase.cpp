#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <sstream>
using namespace std;


int main() 
{
    vector<int>v;
    int n,item,a,b,c;
    cin>>n; 
    
    for(int i=0; i<n; i++) 
    {
        cin>>item;
        v.push_back(item);
    }
    cin>>a;
    if(a<v.size()) 
    { v.erase(v.begin()+a-1);
    }
    cin>>b>>c;
    if(b<c && c<v.size()) 
    {v.erase(v.begin()+b-1,v.begin()+c-1);
    }
    cout<<v.size()<<endl;
    for(auto vin:v) 
    {
        cout<<vin<<" ";
    }
    return 0;
}
