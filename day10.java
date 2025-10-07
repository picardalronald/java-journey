//split string using a delimiter
public class day10 {
    public static void main(String[] args) {

     String name = "baby,lovey,love";
     
     String [] results = name.split(",");
      

      for (String result : results) {
        System.out.println(result);
      }
    }
} 
