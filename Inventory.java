package Assignment2.Q2;
import java.util.ArrayList;
import java.util.List;
import Assignment2.Q2.Vehicle.VehicleType;

public class Inventory {
    private int inventoryID;
    private VehicleType type;
    private List<Vehicle> vehicles;

    public Inventory(int inventoryID, VehicleType type) {
        this.inventoryID = inventoryID;
        this.type = type;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        if(vehicle.getType().equals(this.type)) {
            vehicles.add(vehicle);
        }
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
    
    public VehicleType getType(){
        return type;
    } 

    public int getInventoryID(){
        return inventoryID;
    }

    public List<Vehicle> getVehicles(){
        return vehicles;
    }
}
