public class Car extends Vehicle{
    
    private Gear gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type)
    {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\t - make: " + this.getMake() +
               "\n\t - plate: " + this.getPlate() +
               "\n\t - color: " + this.getColor() +
               "\n\t - category: " + this.getCategory() +
               "\n\t - gear type: " + this.getGear() +
               "\n\t - type: " + this.getType();
    }
}
