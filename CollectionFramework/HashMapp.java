package CollectionFramework;
import java.util.*;

public class HashMapp {
    public static void main(String[] args){
       HashMap<Integer, Integer> hm= new HashMap<>();
        // hm.put("a",1);
        // hm.put("b",2);
        // hm.put("c",3);
        // hm.put("d",4);
        int arr[]={1,2,3,4,5,6,7,8};

        int target=5;
        for(int i=0;i<arr.length;i++){
            int compliment=target-arr[i];
            if(hm.containsKey((compliment))){
                System.out.println("pair found");
                return;
            }
            hm.put(arr[i],i);
        }
       
        System.out.println("pair not found");
    }
    
}
