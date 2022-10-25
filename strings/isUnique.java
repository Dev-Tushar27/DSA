package strings;

import java.util.Scanner;

public class isUnique {
    public static int pos = 0;
    static boolean check(String str){
        if(str.length() == 0){
            return true;
        }
        for (int i = 0; i< str.length()-1; i++) {
            int f = str.charAt(i) ^ str.charAt(i+1);
            if(f == 0){
                return true;
            }
        } 
        return false;       
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        if(check(str)){
            System.out.println("Contains Duplicate characters");
        }else{
            System.out.println("All unique characters");
        }
        scn.close();
    }
}
