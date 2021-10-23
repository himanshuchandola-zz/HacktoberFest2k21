#include <iostream>

using namespace std;

int isMultipleOf3(int n){
    if(n<0)
        n = -n;
    if(n==0){
        return 1;
    }
    if(n==1){
        return 0;
    }
    int odd_cnt=0;
    int even_cnt=0;
    if(n & 1){
        odd_cnt++;
    }
    n = n >> 1;
    if(n & 1){
        even_cnt++;
    }
    n = n >> 1;

    return isMultipleOf3(abs(odd_cnt - even_cnt));
}

int main()
{
    int n;
    cin>> n;
    if(isMultipleOf3){
        cout<<"Multiple"<<endl;
    }
    else{
        cout<<"Not multiple"<<endl;
    }
    return 0;
}
