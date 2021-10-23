#include <iostream>

using namespace std;

int multiplyBy7(int n){
    return ((n<<3) - n);
}
int main()
{
    int n;
    cin>>n;
    cout<<multiplyBy7(n)<<endl;
    return 0;
}
