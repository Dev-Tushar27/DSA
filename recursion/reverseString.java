package recursion;

public class reverseString {
    static void reverse(String s){
        if(s.length() == 0){
            return;
        }
        String ros = s.substring(1);
        reverse(ros);
        System.out.print(s.charAt(0));
    }
    public static void main(String[] args) {
        String string = "binod";
        reverse(string);
    }
}
