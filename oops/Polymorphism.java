package oops;
// class Calculator{
//         int add(int a, int b){
//             System.out.println("add two numbers" + (a+b));
//             return a+b;
//         }
//         int add(int a, int b, int c){
//             System.out.println("add 3 numbers" + (a+b+c));
//             return a+b+c;
//         }
//         double add(double a, double b){
//             return a+b;
//         }
//     }



class Shape{
    void area(){
        System.out.println("area of shape");
    }
}
    class Circle extends Shape{
        void area(){
            System.out.println("area of circle");
        }
    }
    
    class Square extends Shape{
        void area(){
            System.out.println("area of square");
        }
    }

public class Polymorphism {
    public static void main(String[] args){
        // Calculator c= new Calculator();
        // c.add(10,20);
        // c.add(10,20,30);
        // c.add(1.2222,2.3333);
        
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.area();
        s2.area();
    }
    
}
