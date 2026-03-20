import java.util.Scanner;

public class Conditional{
    public static void main(String[] args){    
        
        // int originalPass= 123;
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter your password");
//         int password = sc.nextInt();
//         if(password==originalPass){
//             System.out.println("welcome to your account");
//         }
//         else{
//             System.out.println("wrong password");
//         }

 Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num =sc.nextInt();
        if(num>0){
            System.out.println("positive number");
        }
        else if(num<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("number is zero");
        }

    }
}


// check nmber is positive or negative
