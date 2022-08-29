public class Carpet {
    private String costString;
    private double cost;

    public Carpet(String costString) {
        char firstChar = costString.charAt(0);
        StringBuilder stringBuilder = new StringBuilder(costString);

        if (firstChar == '$') {
            stringBuilder.deleteCharAt(0);
            costString = stringBuilder.toString();
        }

        cost = Double.parseDouble(costString);

        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}