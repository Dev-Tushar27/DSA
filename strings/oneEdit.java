package strings;

import java.util.Scanner;

public class oneEdit {
    static boolean oneEditAway(String f, String s){
        if(f.length() == s.length()){
            return oneEditReplacement(f,s);
        }else if(f.length()+1 == s.length()){
            return oneEditInsert(f,s);
        }else if(f.length()-1 == s.length()){
            return oneEditInsert(s, f);
        }
        return false;
    }

    static boolean oneEditReplacement(String f, String s){
        boolean found = false;
        for(int i = 0; i< f.length(); i++){
            if(f.charAt(i) != s.charAt(i)){
                if(found){
                    return false;
                }
                found = true;
            }
        }
        return true;
    }
    static boolean oneEditInsert(String f, String s){
        int i = 0, j = 0;
        while(i< f.length() && j< s.length()){
            if(f.charAt(i) != s.charAt(j)){
                if(i != j){
                    return false;
                }
                j++;
            }else{
                i++; 
                j++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st string:");
        String s1 = scn.next();
        
        System.out.print("Enter 1st string:");
        String s2 = scn.next();
        System.out.println(oneEditAway(s1, s2));
        scn.close();
    }
}
