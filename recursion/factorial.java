package recursion;

import java.util.Scanner;

class factorial{
    static int fact(int x,int result){
        if(x == 1){
            return result;
        }
        result *= x;
        return fact(x-1, result);
    }
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = scn.nextInt();
        int result = fact(n,1);

        System.out.println("Factorial:"+result);
        scn.close();
    }
}