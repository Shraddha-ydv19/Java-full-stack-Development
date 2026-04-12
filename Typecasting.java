public class Typecasting {
    public static void main(String[] args){
        // Implicit Typecasting -> it is done automatically by comapiler and small data type is 
        //converted into large data type......
        int a=10;
        double b=a;
        System.out.println(b);
        // Explicit Typecasting -> it is done by programmer and large data type is 
        // converted into small data type......
        double p=10.55;
        int q=(int)p;
        System.out.println(q);
    }
}
//char cant be converted into boolean and boolean cant be converted into char.....