public class ConcreteMenuItem extends MenuItem {
    public ConcreteMenuItem(String name, double price, String description) {
        super(name, price, description);
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
    public String getDescription() {
        return description;
    }

    @Override
    public void displayInfo() {
        System.out.println("ConcreteMenuItem - Name: " + name + ", Price: $" + price);
    }
}
