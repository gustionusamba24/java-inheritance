public class Main {
    public static void main(String[] args) {
        BankAccount johnBankAccount = new BankAccount("12345", 1000.00, "John Doe", "johndoe@gmail.com", "(+62) 89964722");

        johnBankAccount.withdrawFunds(100.0);
        johnBankAccount.depositFunds(250);
        johnBankAccount.withdrawFunds(50);

        johnBankAccount.withdrawFunds(200);

        johnBankAccount.depositFunds(100);
        johnBankAccount.withdrawFunds(45.55);
        johnBankAccount.withdrawFunds(54.46);
    }
}
