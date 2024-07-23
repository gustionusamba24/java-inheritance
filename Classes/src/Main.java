public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Toyota");
        car.setModel("Avanza");
        car.setColor("Silver");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
