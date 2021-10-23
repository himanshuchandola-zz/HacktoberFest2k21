#include <iostream>

using namespace std;

int rand7(int index){
    while(index > 21){
        index = (rand5() - 1)*5 + rand5();
    }
    return ((index - 1) % 7) + 1;
}

int main()
{
    int index = 22;
    cout<<rand(index)<<endl;
    return 0;
}
