// print a defined array, then remove the last item using array pop or equivalent
import java.util.ArrayList;
import java.util.Arrays;

public class day15 {
    public static void main(String[] args) {
        String[] names = {"ronald", "ricky", "ervin", "jenny"};

        System.out.println("Original list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Convert array to ArrayList
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        // Remove elements by index
        nameList.remove(2); // removes index 2 -> "ervin"

        System.out.println("\nList removing index 0, 1, 2, 3:");
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
