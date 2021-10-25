/* https://www.codechef.com/SNCK1A21/problems/RRR

Problem Statement: 
A round-robin tournament is being held in Chefland among N teams numbered 1,2,...,N. 
Every team play with all other teams exactly once. All games have only two possible results - win or loss.
A win yields 2 points to the winning team while a loss yields no points. 
What is the maximum number of points a team finishing at the Kth position can score?

Note: If two teams have the same points then the team with the higher team number achieves the better rank.
*/

#include <bits/stdc++.h>

#define ll long long int
#define ull unsigned long long 
#define pb push_back
#define vi vector<int>
#define vll vector<long long>
#define REP(i,n) for(int i=0;i<n;i++)
#define w(t) int t; cin>>t; while(t--)
#define mod 1000000007
#define fast ios_base::sync_with_stdio(0); cin.tie(0);  cout.tie(0);

using namespace std;

int main(){
    fast; 
    int t; cin>>t; while(t--){
        ll n,k; cin>>n>>k;
        ll ans=(n-k)*2;
        if(k%2==1) ans+=k-1;
        else ans+=k-2;
        cout<<ans<<"\n";
    }
}