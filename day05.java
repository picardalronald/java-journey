//capitalize(uppercase first letter of each word) strings using built in function

public class day05 {
    public static void main(String[] args) {

    String name = "jenny";
    //The code takes the first character of the string, converts it to uppercase, 
    //then joins it with the rest of the string, resulting in the first letter being capitalized ( "jenny" → "Jenny").
    String first = name.substring(0,1).toUpperCase() + name.substring(1);
    

    System.out.println(first);


    }
} 
    

