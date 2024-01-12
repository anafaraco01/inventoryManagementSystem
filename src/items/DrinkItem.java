package items;

public class DrinkItem implements Item {
    private String name;
    private double price;

    public DrinkItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getColor() { return "this item doesn't have a color"; }
}
