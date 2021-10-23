#include<stdio.h>
#include<conio.h>
int main()
{
    int a, b;
    scanf("%d%d",&a,&b);
          //initialisation of bool = false;
    while(a < b){
        _Bool flag = 0;
        for(int i = 2; i < a/2; i++){
            if(a % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            printf("%d\n",a);
        }
        a++;
    }
    return 0;

}
