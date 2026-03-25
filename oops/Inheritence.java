package oops;

// class Employee{
//     String name;
//     int id;
//     int salary;
//     Employee(String name, int id, int salary){
//         this.name=name;
//         this.id=id;
//         this.salary=salary;
//     }
//     double calculateSalary(){
//         return salary;
//     }
// }
    // class manager extends Employee{
    //     double bonus;
    //     manager(String name, int id, int salary, double bonus ){
    //         super(name,id,salary);
    //         this.bonus=bonus;
    //     }
    //     double calculateSalary(){
    //         return salary+bonus;
    //     }
    // }
    // //developer..
    // class developer extends Employee{
    //     double overtime;
    //     developer(String name, int id, int salary, double overtime){
    //         super(name,id,salary);
    //         this.overtime=overtime;
    //     }
    //     double calculateSalary(){
    //         return salary+overtime;
    //     }
    // }



    // veichle system .....
    class Vehicle{
        String brand;
        void start(){
            System.out.println("vehicle is startingg");
        }
    }
    class Car extends Vehicle{
        @Override
        void start(){
            System.out.println("car is startingg");
        }
    }
    class Bike extends Vehicle{
        @Override
        void start(){
            System.out.println("bike is starting");
        }
    }
public class Inheritence {
         public static void main(String[] args){
            //inheritence is a process where one class acquires the properties and behaviors of another class. The class which inherits the properties is called subclass or child class and the class whose properties are inherited is called superclass or parent class.
            // //inheritence is achieved by using the keyword "extends" in java.   
            // Employee e1=new manager("shraddha", 12, 50000,2000);
            // Employee e2=new developer("sneha",13,40000,2000);
            // System.out.println(e1.calculateSalary());
            // System.out.println(e2.calculateSalary());
            Vehicle v1=new Car();
            Vehicle v2=new Bike();
            v1.start();
            v2.start();
            // Car c1=new Car();
            // Bike b1=new Bike();
            // c1.start();
            // b1.start();
         }
}
