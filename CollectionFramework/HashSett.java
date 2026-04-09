package CollectionFramework;
import java.util.*;

public class HashSett {
    public static void main(String[] args){
        //HashSet is a collection that contains no duplicate elements and it is based on the hash code of the elements.
        //It does not maintain any order of the elements and it allows null values.
        //It is not synchronized and it is not thread-safe.
        //It is implemented using a hash table and it uses the hash code of the elements to store and retrieve them.
        //It is faster than other collections like ArrayList and LinkedList for searching and retrieving elements.

        // HashSet<Integer> hs = new HashSet<>();
        // hs.add(20);
        // hs.add(30);
        // hs.add(20);
        // hs.add(40);
        // hs.add(50);
        // System.out.println(hs);

        // HashMap<String, Integer> hm= new HashMap<>();
        // hm.put("a",1);
        // hm.put("b",2);
        // hm.put("c",3);
        // hm.put("d",4);
        // System.out.println(hm);

        TreeSet<Integer> ts =new TreeSet<>();
        ts.add(10);
        ts.add(60);
        ts.add(20);
        ts.add(50);
        System.out.println(ts);


    }
}
