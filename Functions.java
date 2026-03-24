public class Functions {
    static void  greet(){
        System.out.println("hello shraddha");
    }
    static void add(int a ,int b){
        int sum = a+b;
        System.out.println("sum = "+sum);
    }
    static void even(int num){
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args){
        //function is a block of code which is used to perform a specific task and it is reusable...
        // function is also called as method in java and it is defined inside the class and it is called by its name...
        // function can have parameters and it can return a value...
        // function can be called by its name and it can be called from another function...
        // function can be called from main function and it can be called from another function...

        // syntax of function...
        // return_type function_name(parameters){
        //     // body of the function...
        //     return value;
        // }
      greet(); //function call.....
      add(10,29);
      even(20);
    }
}
