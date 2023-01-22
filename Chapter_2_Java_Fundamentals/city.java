package Chapter_2_Java_Fundamentals;

public class city {
    
    public static void main(String[] args) {

        String city;
        city = "San Francisco";
        int StringSize = city.length();
        char letter = city.charAt(0);
        String UpperCity = city.toUpperCase();
        String LowerCity = city.toLowerCase();
        System.out.println(city);
        System.out.println(StringSize);
        System.out.println(letter);
        System.out.println(UpperCity);
        System.out.println(LowerCity);

    }


}
