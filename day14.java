// split a name string into a char-array, then capitalize the first letter by overwriting char-array item zero, then reconstruct into a string
public class day14 {
    public static void main(String[] args) {

    String name = "halimaw ronald";
    char[] words = name.toCharArray();
  
   if (words.length > 0) {
      words[0] = Character.toUpperCase(words[0]);
   }

   
   String result = new String(words);


    System.out.println(result);
  
    }
} 
