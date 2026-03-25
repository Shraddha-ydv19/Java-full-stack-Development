public class Wapper {
    public static void main(String[] args){
        // Wrapper class is a class that provides a way to use primitive data types as objects. The wrapper classes in java are Byte, Short, Integer, Long, Float, Double, Character and Boolean. The wrapper classes are used to convert primitive data types into objects and vice versa. The wrapper classes are also used to provide utility methods for the primitive data types. The wrapper classes are also used to provide a way to use the primitive data types in collections like ArrayList, HashMap etc.
        int a=10;
        Integer b=a; //autoboxing
        System.out.println(b);
        Integer c=20;
        int d=c; //unboxing
        System.out.println(d);
    }
}
