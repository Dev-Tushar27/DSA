package strings;

import java.util.Arrays;
import java.util.Scanner;

public class checkPermutation {
    static String sort(String s){
        char [] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    static boolean check(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st string:");
        String s = scn.nextLine();
        System.out.print("Enter 2nd string:");
        String t = scn.nextLine();
        if(check(s,t)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        scn.close();
    }
}
