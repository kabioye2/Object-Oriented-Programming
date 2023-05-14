package Assignment2.Q2;


public class Vehicle {
    private int vehicleID;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private VehicleType vehicleType;
    private boolean available = true; //for rent- Boolean- true by default
    private double dailyRate;

    public enum VehicleType{
        CAR, 
        SUV, 
        TRUCK
    }

    public Vehicle(int vehicleID, String make, String model, int year, int mileage, VehicleType vehicleType, double dailyRate) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.vehicleType = vehicleType;
        this.dailyRate = dailyRate;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public VehicleType getType() {
        return vehicleType;
    }

    public void setType(VehicleType type) {
        this.vehicleType = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    
}
