import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner widthInput = new Scanner(System.in);
        System.out.println("Width of floor in feet: ");
        double width = Double.parseDouble(widthInput.nextLine());

        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Length of floor in feet: ");
        double length = Double.parseDouble(lengthInput.nextLine());

        Scanner costInput = new Scanner(System.in);
        System.out.println("Cost for 1 foot of carpet: ");
        String cost = costInput.nextLine();

        Floor floor = new Floor(width, length);
        Carpet carpet = new Carpet(cost);

        Calculator carpetCost = new Calculator(floor, carpet);
        System.out.println("Total cost for " + floor.getArea() + " ft = $" + carpetCost.getTotalCost());
    }
}