#include <iostream>

using namespace std;

string getDayOfWeek(int d, int m, int y) {
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if(m < 3){
            y = y - 1;
        }
        int s = (y + (y/4) - (y/100) + (y/400) + t[m-1] + d) % 7;
        string s1 = "sunday, monday, tuesday, wednesday, thursday, friday, saturday";
        for(int i = 0 ; i<s1.size() ; i++){
            if(s == s1[i]){
                return s1[i];
            }
        }
    }

int main()
{
    getDayOfWeek(17, 8, 1567);
    return 0;
}
