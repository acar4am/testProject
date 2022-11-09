public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16,21);
        Vehicle sportcar = new Vehicle(2,14,12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Minivan can carry " +minivan.passengers+
                " passengers with range of "+minivan.range()+ " Miles.");
        System.out.println("To go " +dist+ " miles minivan needs " +gallons+ " gallons of fuel");
        gallons = sportcar.fuelNeeded(dist);
        System.out.println("Sportcar can carry " +sportcar.passengers+
                " passengers with range of " +sportcar.range()+ " Miles.");
        System.out.println("To go " +dist+ " miles sportcar needs " +gallons+ " gallons of fuel");

        if(minivan.range() > sportcar.range())
            System.out.println("Minivan has greater range");
    }
}
class Vehicle{
    int passengers,//number of passengers
        fuelcap, //fuel capacity in gallons
        mpg;//fuel consumption in miles per gallon

    Vehicle(int p, int f, int m){//constructor for Vehicle
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //display the range
    int range(){//return range
        return fuelcap * mpg;
    }
    //parameterized method that computes fuel needed for a given distance
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
}
