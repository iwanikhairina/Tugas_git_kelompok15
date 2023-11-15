public abstract class MenuItem {
    protected String name;
    protected double price;
    protected String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // abstrak
    public abstract String getName();
    public abstract double getPrice();
    public abstract String getDescription();
    public abstract void displayInfo();
}
