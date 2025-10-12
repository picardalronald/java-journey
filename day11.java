
//split string to an array of (single) characters

public class day11 {
    public static void main(String[] args) {

     String name = "Jenny";
     
     String [] chars = name.split("");
      

      for (String cha : chars) {
        System.out.println(cha.toUpperCase());
      }
    }
} 
