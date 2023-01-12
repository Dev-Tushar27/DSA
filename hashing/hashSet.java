package hashing;
import java.util.HashSet;
import java.util.Iterator;
public class hashSet{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it+" ");
            it.next();
        }
        System.out.println();
        if(set.contains(2)){
            System.out.println("Contains 2");
        }else{
            System.out.println("Does not Contain 2");
        }
        set.remove(1);
        if(set.contains(1)){
            System.out.println("Contains 1");
        }else{
            System.out.println("Does not Contain 1");
        }

        System.out.println(set);
    }
}