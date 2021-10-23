#include <bits/stdc++.h>

using namespace std;

void generateSquare(int n){
    int magicSquare [n][n];
    memset(magicSquare, 0, sizeof(magicSquare));
    int i = n/2;
    int j = n-1;
    for(int num = 1; num <= n*n;){
        if(i == -1 && j == n){
            i = 0;
            j = n-2;
        }
        else{
            if(j == n){
                j = 0;
            }
            else if(i < 0){
                i = n-1;
            }
        }
        if(magicSquare[i][j]){
            j -= 2;
            i++;
            continue;
        }else{
            magicSquare[i][j] = num++;
            j++;
            i--;
        }
    }

    //print square
    cout<<"The magic square sum for " << n << "is"<< n*(n*n + 1)/2 << endl;
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            cout<< setw(7)<<magicSquare[i][j]<<" ";
        }cout<<endl;
    }
}

int main()
{
    int n=3;
    generateSquare(n);
    return 0;
}
