public class Customer {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public Customer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public Customer() {
        this("Nobody", "nobody@gmail.com");
    }

    public Customer(String customerName, String customerEmail) {
        this(customerName, 10000.00, customerEmail);
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
