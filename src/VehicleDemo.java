public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16,21);
        Vehicle sportcar = new Vehicle(2,14,12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Minivan can carry " +minivan.getPassengers()+
                " passengers with range of "+minivan.range()+ " Miles.");
        System.out.println("To go " +dist+ " miles minivan needs " +gallons+ " gallons of fuel");
        gallons = sportcar.fuelNeeded(dist);
        System.out.println("Sportcar can carry " +sportcar.getPassengers()+
                " passengers with range of " +sportcar.range()+ " Miles.");
        System.out.println("To go " +dist+ " miles sportcar needs " +gallons+ " gallons of fuel");

        if(minivan.range() > sportcar.range())
            System.out.println("Minivan has greater range");
    }
}
class Vehicle{
    private int
        passengers,//number of passengers
        fuelcap, //fuel capacity in gallons
        mpg;//fuel consumption in miles per gallon
    int getPassengers(){ return passengers; }
    int getFuelcap() { return fuelcap; }
    int getMpg() { return mpg; }
    Vehicle(int passengers, int fuel, int mpg){//constructor for Vehicle
        this.passengers = passengers;
        fuelcap = fuel;
        this.mpg = mpg;
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
