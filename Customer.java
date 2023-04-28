package Assignment2.Q2;
import java.util.List;
import java.util.ArrayList;


public abstract class Customer implements Reportable{
    private int id;
    private String name;
    private int discountRate;
    private List<RentalOrder> orderHistory;

    public Customer(int id, String name, int discountRate) {
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
        this.orderHistory = new ArrayList<>();
    }

    public List<RentalOrder> getOrderHistory(){
        return orderHistory;
    }

    public void addOrder(RentalOrder order) {
        orderHistory.add(order);
    }

    public void removeOrder(RentalOrder order) {
        orderHistory.remove(order);
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    abstract public String generateReport();

}
