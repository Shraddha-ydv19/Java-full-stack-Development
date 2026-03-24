package oops;


   interface  Payments {
     void pay();
   
    
   }
   class creditcard implements Payments{
     public void pay(){
        System.out.println("paying with credit card");
    }
   } 
   class debitcard implements Payments{
    public void pay(){
        System.out.println("paying with debit card");
    }
   }
// abstract class Animal{
//             abstract void sound();
//         }
//         class dog extends Animal{
//             void sound(){
//                 System.out.println("dog barks");
//             }
            
//         }
//         class cat extends Animal{
//             void sound(){
//                 System.out.println("cat meows");
//             }
//         }
public class Abstaction {
    public static void main(String[] args){
        // abstraction is the process of hiding the implementation details and showing only the functionality to the user...
        // abstraction is achieved by using abstract class and interface in java...
        // abstract class is a class which is declared with abstract keyword and it can have abstract and non-abstract methods...
        // abstract method is a method which is declared without any implementation and it must be implemented by the subclass...
        // interface is a collection of abstract methods and it can have only abstract methods and static final variables...
        // Animal a1=new dog();
        // Animal a2=new cat();
        // a1.sound();
        // a2.sound();
        Payments p1=new creditcard();
        Payments p2=new debitcard();
        p1.pay();
        p2.pay();

    }
}
