package Chapter_6_Class;


class Vehicles {

    int passengers;
    int fuelcap;
    int mpg;

    // Creating a constructor
    Vehicles (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    int range() {
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}


public class VehicleDemo {
    
    public static void main(String[] args) {

        // Construct complete vehicles
        Vehicles minivan = new Vehicles(7, 16, 21);
        Vehicles sportscar = new Vehicles(2, 14, 12);

        double gallons;
        final int DIST = 252;

        gallons = minivan.fuelNeeded(DIST);

        System.out.println("To go " + DIST + " miles minivan needs "
                            + gallons + " gallons of fuel.");
        
        double gallons2 = sportscar.fuelNeeded(DIST);

        System.out.println("To go " + DIST + " miles sportscar needs "
                            + gallons2 + " gallons of fuel.");
    }

}
