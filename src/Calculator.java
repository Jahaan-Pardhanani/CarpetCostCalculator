public class Calculator {
    private Floor floorInst;
    private Carpet carpetInst;
    private double totalCost;

    public Calculator(Floor floorInst, Carpet carpetInst) {
        this.floorInst = floorInst;
        this.carpetInst = carpetInst;

        double floor = floorInst.getArea();
        double carpet = carpetInst.getCost();

        this.totalCost = floor * carpet;
    }

    public double getTotalCost() {
        return totalCost;
    }
}