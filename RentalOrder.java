package Assignment2.Q2;

public class RentalOrder {
    private double totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;

    public RentalOrder(Customer customer, Vehicle vehicle){
        this(customer, vehicle, 1);
    }

    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength){
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = rentalLength;
    }
    

    public void calculateTotalCost(){
        if(customer.getDiscountRate() == 0){
            this.totalCost = this.rentalLength * this.vehicle.getDailyRate();
        }else {
            this.totalCost = (this.rentalLength * this.vehicle.getDailyRate()) * (1 - (this.customer.getDiscountRate() / 100));
        }
    }

    public void completeOrder(){
        this.customer.addOrder(this);
        this.vehicle.setAvailable(false);
    }

    public double getTotalCost(){
        calculateTotalCost();
        return this.totalCost;
    }

    public Customer getCustomer(){
        return customer;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public int getRentalLength(){
        return rentalLength;
    }
    
}
