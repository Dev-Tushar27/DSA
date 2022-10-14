package recursion;

import java.util.Scanner;

public class fibonacci {
    static void fibo(int n,int first, int second){
        if(n==0){
            return;
        }

        int third = first+second;
        System.out.print(third+" ");
        fibo(n-1, second, third);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the range :");
        int n = scn.nextInt();
        int first = 0, second = 1;
        System.out.print(first+" "+second+" ");
        fibo(n-2, first, second);
        scn.close();
    }
}
