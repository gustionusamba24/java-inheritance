public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane", "08/07/1990", "09/08/2021");
        System.out.println("Age " + jane.getAge());
        System.out.println("Collected Pay " + jane.collectPay());
        System.out.println(jane);

        SalariedEmployee john = new SalariedEmployee("John", "06/05/1984", "02/02/2019", 35000);
        System.out.println(john);
        System.out.println("John's Paycheck = $" + john.collectPay());

        john.retire();
        System.out.println("John's pension check = $" + john.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "07/07/1978", "04/04/2023", 15);
        System.out.println(mary);
        System.out.println("Mary's PayCheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
