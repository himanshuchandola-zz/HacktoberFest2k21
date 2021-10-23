#include <iostream>
using namespace std;
#define ARR_SIZE 100

void printScore(int arr[], int arr_size){
    for(int i=0; i<arr_size; i++){
        cout << arr[i] << " ";
    }cout << endl;
}                  //[]

void combinations(int n, int i){
    static int arr[ARR_SIZE];

    if(n == 0){
        printScore(arr, i);
    }
    else if(n > 0){
        for(int k=1; k<=3; k++){
            arr[i] = k;
            printScore(n-k, i+1);
        }
    }
}

int main()
{
    int n;
    cin >> n;
    combinations(n, 0) << endl;
    return 0;
}
