public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius < 0 ? 0 : radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
