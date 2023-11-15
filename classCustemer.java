
public class Customer extends Person {
    private int tableNumber;

    public Customer(String name, int tableNumber) {
        super(name);
        this.tableNumber = tableNumber;
    }
    
    // Getter methods
       public String getName() {
        return name;
    }

    // Getter method specific to Customer
    public int getTableNumber() {
        return tableNumber;
    }
}
