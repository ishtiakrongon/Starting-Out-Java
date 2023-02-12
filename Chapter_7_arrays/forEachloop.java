package Chapter_7_arrays;
import java.util.ArrayList;

public class forEachloop {
    
    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements
        // in an array/collection less steps, more readable
        // less flexible

        // String[] animals = new String[4];

        // animals[0] = "cat";
        // animals[1] = "dog";
        // animals[2] = "rat";
        // animals[3] = "tiger";
        // animals[4] = "elephant";

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("tiger");

        for(String i : animals) {

            System.out.println(i);

        }

    }

}
