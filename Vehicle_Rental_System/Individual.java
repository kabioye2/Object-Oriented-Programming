package Assignment2.Q2;


public class Individual extends Customer{
    int age;
    String state;
    String zip;

    public Individual(int id, String name, int discountRate, int age, String state, String zip) {
        super(id, name, discountRate);
        this.age = age;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String generateReport(){
        StringBuilder report = new StringBuilder();
        report.append("Individual Customer\n");
        report.append("Customer ID: ").append(this.getID()).append("\n");
        report.append("Name: ").append(this.getName()).append("\n");
        report.append("Age: ").append(this.age).append("\n");
        report.append("State: ").append(this.state).append("\n");
        report.append("Zipcode: ").append(this.zip).append("\n");
        report.append("Discount Rate: ").append(this.getDiscountRate()).append("%").append("\n");

        return report.toString();

    }

    
}
