package Chapter_2_Java_Fundamentals;
import java.util.Random;


public class genRand {
    
    public static void main(String[] args) {

        Random rand = new Random();

        //int x = rand.nextInt();
        boolean z = rand.nextBoolean();

        System.out.println(z);

    }

}
