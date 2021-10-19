package RecursionProblems;

import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
//        Tower of Hanoi
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rings :");
        int num = sc.nextInt();
        TOH(num);
    }

    private static void TOH(int num) {
        if(num==1){
            System.out.println("Transfer ring " + num + " from Pole A to Pole C");
            return;
        }
        System.out.println("Transfer ring " + num + " from Pole A to Pole B");
        TOH(num-1);
        System.out.println("Transfer ring " + num + " from Pole B to Pole C");
    }
}
