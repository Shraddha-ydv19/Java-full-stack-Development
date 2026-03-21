import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        //how to create
        int age[] = {21,32,43,54,65,76,87}; 
        //how to access
        System.out.println(age[3]);
        //how to change
        age[3]=90;
        System.out.println(age[3]);

        //full array print
        System.out.println(Arrays.toString(age));
        
    }
}
