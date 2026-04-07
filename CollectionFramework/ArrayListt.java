package CollectionFramework;
import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(33);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println(list.get(2));
        // list.set(2,20);
        // System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
        int p =list.get(0);
        for(int i=0;i<list.size();i++){
            p=Math.max(p,list.get(i));


        }
        System.out.println("maximum no. is: " + p);
        
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
    
}
