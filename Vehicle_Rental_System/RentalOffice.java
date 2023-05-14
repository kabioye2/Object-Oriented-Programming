package Assignment2.Q2;
import java.util.List;
import java.util.ArrayList;

public class RentalOffice implements Reportable{
    private int officeID;
    private String locationZip;
    private List<Inventory> inventories;
    private List<RentalOrder> orderHistory;

    public RentalOffice(int officeID, String locationZip) {
        this.officeID = officeID;
        this.locationZip = locationZip;
        this.inventories = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }

    public void addInventory(Inventory inventory) {
        // check if an inventory of the same type already exists
        if (!inventories.contains(inventory)) {
            inventories.add(inventory);
        }
    }

    public void removeInventory(Inventory inventory) {
        inventories.remove(inventory);
    }

    public void addOrder(RentalOrder order) {
        orderHistory.add(order);
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Office ID: ").append(officeID).append("\n");
        report.append("Location Zip: ").append(locationZip).append("\n\n");
        report.append("===Inventories===\n");

        for (Inventory inventory : inventories) {
            report.append("Vehicle Type: ").append(inventory.getType().toString()).append("\n");
            report.append("Inventory ID: ").append(inventory.getInventoryID()).append("\n");

            List<Vehicle> vehicles = inventory.getVehicles();

            for (Vehicle vehicle : vehicles) {
                report.append("Vehicle ID: ").append(vehicle.getVehicleID()).append("\n");
                report.append("Make: ").append(vehicle.getMake()).append("\n");
                report.append("Model: ").append(vehicle.getModel()).append("\n");
                report.append("Year: ").append(vehicle.getYear()).append("\n");
                report.append("Mileage: ").append(vehicle.getMileage()).append("\n");
                report.append("Daily Rate: $").append(String.format("%.2f",vehicle.getDailyRate())).append("\n");
                report.append("Availability: ").append(vehicle.isAvailable() ? "Available" : "Not available").append("\n\n");

            }
        }

        report.append("\n===Order History===\n");
        for (RentalOrder order : orderHistory) {
            report.append(order.getCustomer().generateReport());
            report.append("Vehicle ID: ").append(order.getVehicle().getVehicleID()).append("\n");
            report.append("Rental Length: ").append(order.getRentalLength()).append("\n");
            report.append("Total Cost: $").append(String.format("%.2f",order.getTotalCost())).append("\n\n");
        }

        return report.toString();
    }
    
}
