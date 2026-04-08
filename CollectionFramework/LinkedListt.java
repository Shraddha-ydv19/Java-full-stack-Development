package CollectionFramework;
import java.util.LinkedList;

public class LinkedListt {
    public static void main (String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.addFirst(10);
        ll.addLast(16);
        Integer mid=ll.size()/2;
        System.out.println(mid);
        ll.remove(mid);
        System.out.println(ll.get(ll.size()-1));
    }
}
