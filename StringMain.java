public class StringMain{
    public static void main (String[] args){
        String firstName= "Shraddha";
        String LastName= "Yadav";
        String name ="    shraddha yadav   ";
        System.out.println(name);
        System.out.println(firstName.concat(" " + LastName));
        System.out.println(firstName.length());
        System.out.println(firstName.contains(LastName));
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.equals(name));
        System.out.println(firstName.equalsIgnoreCase(name));
        System.out.println(firstName.indexOf("a"));
        System.out.println(firstName.replace("d", "p"));
        System.out.println(name.trim());
        
    }
}