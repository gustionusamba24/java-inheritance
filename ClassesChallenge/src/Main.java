public class Main {
    public static void main(String[] args) {
        BankAccount johnBankAccount = new BankAccount();

        johnBankAccount.setAccountNumber("12345");
        johnBankAccount.setAccountBalance(1000.00);
        johnBankAccount.setCustomerName("John Doe");
        johnBankAccount.setCustomerEmail("johndoe@gmail.com");
        johnBankAccount.setCustomerPhone("(+62) 89964722");

        johnBankAccount.withdrawFunds(100.0);
        johnBankAccount.depositFunds(250);
        johnBankAccount.withdrawFunds(50);

        johnBankAccount.withdrawFunds(200);

        johnBankAccount.depositFunds(100);
        johnBankAccount.withdrawFunds(45.55);
        johnBankAccount.withdrawFunds(54.46);
    }
}
