
//convert array to a comma separated string (array join)

public class day09 {
    public static void main(String[] args) {

       String[] namelist = {"ronald", "Ricky", "Jenny"};

       String result = String.join(", ",  namelist);

       System.out.println(result);
    }
} 
