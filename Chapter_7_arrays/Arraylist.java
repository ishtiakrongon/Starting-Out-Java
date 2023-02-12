package Chapter_7_arrays;
import java.util.ArrayList;

public class Arraylist {
    
    public static void main(String[] args) {

        // Arraylist = a resizable array.
        // Elements can be added and removed after compilation phase
        // store reference data types.

        ArrayList<String> food = new ArrayList<String>();

        // add foods in array list

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for(int i = 0; i < food.size(); i++) {

            System.out.println(food.get(i));

        }

    }

}
