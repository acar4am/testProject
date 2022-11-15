class Truck extends Vehicle{
    private int cargocap; // cargo capacity for truck
    private String name;

    Truck(int passengers, int fuel, int mpg, int cargo, String name) {
        super(passengers, fuel, mpg);
        cargocap = cargo;
        this.name = name;
    }

    int getCargo() { return cargocap; }
    void setCargo(int c) { cargocap = c; }

    public String getName() {
        return name;
    }
}
class TruckDemo{
    public static void main(String[] args) {
        // construct some trucks
        var pickup = new Truck(2, 180,15, 4000, "pickup");
        double gallons;
        int dist = 255;

        gallons = pickup.fuelNeeded(dist);
        System.out.println(pickup.getName()+" can carry " +pickup.getCargo() +" pounds");
        System.out.println("To go " +dist+ " miles " +pickup.getName()+ " needs " +
                            +gallons+ " gallons of fuel");

    }
}
