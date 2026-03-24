package oops;
class Calculator{
        int add(int a, int b){
            System.out.println("add two numbers" + (a+b));
            return a+b;
        }
        int add(int a, int b, int c){
            System.out.println("add 3 numbers" + (a+b+c));
            return a+b+c;
        }
        double add(double a, double b){
            return a+b;
        }
    }
public class Polymorphism {
    public static void main(String[] args){
        Calculator c= new Calculator();
        c.add(10,20);
        c.add(10,20,30);
        c.add(1.2222,2.3333);
    }
    
}
