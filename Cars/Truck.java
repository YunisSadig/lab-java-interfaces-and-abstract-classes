package Cars;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }
    public void setTowingCapacity(double towingCapacity){
        if(towingCapacity<0){
            System.err.println("The towing capacity cannot be under 0");
        }
        else {
            this.towingCapacity=towingCapacity;
        }
    }
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nTowing Capacity: " + towingCapacity + " lbs";
    }

}
