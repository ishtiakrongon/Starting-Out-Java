package Chapter_6_Class.Vehicle;

// Creating a class

class VehicleDemo {
    int passengers; // number of passengers - Class Variable
    int fuelcap; // fuel capacity in gallons - Class Variable
    int mpg; // fuel consumption in miles per gallon
}

// MAIN CLASS
public class Vehicle {
    
    public static void main(String[] args) {

        // Creating an object of class - vehicle
        VehicleDemo minivan = new VehicleDemo(); // Here minivan is an instance of the class 

        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Compute the range

        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);

    }

}

