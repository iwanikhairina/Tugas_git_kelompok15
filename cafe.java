import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String name;
    private List<MenuItem> menu;
    private List<Order> orders;

    public Cafe(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void takeOrder(Customer customer, List<MenuItem> items) {
        Order order = new Order();
        for (MenuItem item : items) {
            order.addItem(item);
        }
        orders.add(order);

        // Optional: Print order details
        System.out.println("Order placed by " + customer.getName() +
                " at table " + customer.getTableNumber() +
                ". Total: $" + order.calculateTotal());
    }

    public void displayMenu() {
        System.out.println("Menu of " + name + ":");
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

    public void displayOrders() {
        System.out.println("Orders in " + name + ":");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Order " + (i + 1) + ": Total $" + orders.get(i).calculateTotal());
        }
    }
}
