public class Main {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Tim", 5000, "tim@gmail.com");
        System.out.println(firstCustomer.getCustomerName());
        System.out.println(firstCustomer.getCreditLimit());
        System.out.println(firstCustomer.getCustomerEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getCustomerName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getCustomerEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@gmail.com");
        System.out.println(thirdCustomer.getCustomerName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getCustomerEmail());
    }
}
