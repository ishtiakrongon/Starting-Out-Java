package Chapter_6_Class.oopBase;

public class mainfile {
    
    public static void main(String[] args) {

        car myCar1 = new car();
        car myCar2 = new car();
        
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        System.out.println(myCar2.year);
        System.out.println(myCar2.color);

        myCar1.drive();
        myCar1.brake();
    }

}
