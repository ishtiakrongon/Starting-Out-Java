package Chapter_5_methods;

/*
 * This program demonstrates hierarchical method calls
 */


public class deepAndDeeper {
    
    public static void main(String[] args) {

        System.out.println("I am starting in main.");
        deep();
        System.out.println("Now I am back in main.");
    }

    public static void deep() {

        System.out.println("I am now in deep");
        deeper();
        System.out.println("Now I am back in the deep.");

    }

    public static void deeper() {

        System.out.println("I am now in deeper.");
    }

}
