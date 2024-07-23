public class BankAccount {
    private double accountBalance;
    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        System.out.println("Empty constructor initialized");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phone) {
        System.out.println("Bank Account constructor with parameter called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is $" + this.accountBalance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.accountBalance - withdrawAmount < 0) {
            System.out.println("Insufficient funds. You only have $" + this.accountBalance + " in your account.");
        } else {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance is $" + this.accountBalance);
        }
    }
}
