#include <iostream>
using namespace std;

float getAvg(float prev_avg, int x, int n){
    return (( (prev_avg * n)+x)/ (n+1) );
}

void streamAvg(int arr[], int n){
    float avg = 0;
    for(int i = 0; i<n ; i++){
        avg = getAvg(avg, arr[i], i);
        cout<<avg << " ";
    }
    return;
}

int main()
{
    int n=3;
    int arr[] = {10,20,30,40};
    streamAvg(arr, n);
    return 0;
}
