import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("Java Cafe");

        // Menambahkan item-menu ke kafe
        MenuItem coffee = new ConcreteMenuItem("Coffee", 2.5, "Black coffee");
        MenuItem sandwich = new ConcreteMenuItem("Sandwich", 5.0, "Chicken sandwich");
        cafe.addMenuItem(coffee);
        cafe.addMenuItem(sandwich);

        // Menampilkan menu kafe
        cafe.displayMenu();

        // Membuat pesanan oleh pelanggan
        Customer customer = new Customer("John", 1);
        List<MenuItem> customerOrder = new ArrayList<>();
        customerOrder.add(coffee);
        customerOrder.add(sandwich);
        cafe.takeOrder(customer, customerOrder);

        // Menampilkan pesanan yang ditempatkan
        cafe.displayOrders();
    }
}
