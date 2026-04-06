package com.shraddha;

public class Exception {
    public static void main(String[] args){
        try{
            int a=10/0;
            System.out.println(a);

        }
        catch(ArithmeticException e){
            System.out.println("you cant divide a number by zero");
        }
        finally{
            System.out.println("alawys run");
        }

    }
}
