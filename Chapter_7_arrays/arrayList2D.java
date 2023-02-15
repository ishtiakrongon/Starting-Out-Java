package Chapter_7_arrays;
import java.util.*;


public class arrayList2D {
    
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> backerylist = new ArrayList<String>();
        backerylist.add("pasta");
        backerylist.add("garlic bread");
        backerylist.add("donuts");

        ArrayList<String>  produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("soda");
        drinkList.add("coffee");
        drinkList.add("CocaCola");

        // Add arrays into 2d arrays
        groceryList.add(backerylist);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(2).get(1));
    }

}
