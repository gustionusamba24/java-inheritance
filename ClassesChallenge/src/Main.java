public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountBalance(8000.00);
        bankAccount.setAccountNumber("1234567890");
        bankAccount.setCustomerName("John Doe");
        bankAccount.setCustomerEmail("johndoe@gmail.com");
        bankAccount.setCustomerPhone("(+62) 812-3456-7890");

        bankAccount.withdrawFunds(100.0);
        bankAccount.depositFunds(500);
        bankAccount.withdrawFunds(100.0);
    }
}
