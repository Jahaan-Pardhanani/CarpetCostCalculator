public class Floor {
    private double width;
    private double length;
    private double area;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        this.area = width * length;
    }

    public double getArea() {
        return area;
    }
}