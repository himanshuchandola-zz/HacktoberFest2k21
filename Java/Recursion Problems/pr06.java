package RecursionProblems;

import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
//        Printing increasing and decreasing series
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number : ");
        num = sc.nextInt();
        System.out.println("Increasing Series : \n");
        INCREASING(num);
        System.out.println("Decreasing Series : \n");
        Decreasing(num);
    }

    private static void Decreasing(int num) {
        if(num==0){
            return;
        }
        System.out.println(num);
        Decreasing(num-1);
    }

    private static void INCREASING(int num) {
        if(num==0){
            return;
        }
        INCREASING(num-1);
        System.out.println(num);
    }
}
