public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane", "08/07/1990", "09/08/2021");
        System.out.println("Age " + jane.getAge());
        System.out.println("Collected Pay " + jane.collectPay());
        System.out.println(jane);

        Employee john = new Employee("John", "06/05/1984", "02/02/2019");
        System.out.println(john);
    }
}
