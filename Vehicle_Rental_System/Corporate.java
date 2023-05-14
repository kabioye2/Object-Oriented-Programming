package Assignment2.Q2;

public class Corporate extends Customer{
    String taxID;
    String country;

    public Corporate(int id, String name, int discountRate, String country, String taxID){
        super(id, name, discountRate);
        this.taxID = taxID;
        this.country = country;
    }

    @Override
    public String generateReport(){
        StringBuilder report = new StringBuilder();
        report.append("Corporate Customer\n");
        report.append("Customer ID: ").append(this.getID()).append("\n");
        report.append("Company Name: ").append(this.getName()).append("\n");
        report.append("Country: ").append(this.country).append("\n");
        report.append("Tax ID: ").append(this.taxID).append("\n");
        report.append("Discount Rate: ").append(this.getDiscountRate()).append("%").append("\n");

        return report.toString();

    }
}
