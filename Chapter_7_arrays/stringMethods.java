package Chapter_7_arrays;

public class stringMethods {
    
    public static void main(String[] args) {

        String name = "Hollowfire";
        String name2 = "          Fearlock        ";

        boolean result = name.equalsIgnoreCase(name);
        int totalCharacter = name.length();
        char index_Position_Of_String = name.charAt(2);
        int characterPosition = name.indexOf("f");
        String upperCase = name.toUpperCase();
        String lowerCase = name.toLowerCase();
        String reduceSpace = name2.trim();

        System.out.println(result);
        System.out.println(totalCharacter);
        System.out.println(index_Position_Of_String);
        System.out.println(characterPosition);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(reduceSpace);

    }

}
