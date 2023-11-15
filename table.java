public class Table {
    private int tableNumber;
    private boolean isOccupied;
    private Customer currentCustomer;
    private Order currentOrder;
    private Employee assignedEmployee;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.isOccupied = false;
        this.currentCustomer = null;
        this.currentOrder = null;
        this.assignedEmployee = null;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupyTable(Customer customer, Employee employee) {
        if (!isOccupied) {
            isOccupied = true;
            currentCustomer = customer;
            currentOrder = new Order();
            assignedEmployee = employee;
            System.out.println("Table " + tableNumber + " is now occupied by " + customer.getName() +
                    " and served by " + employee.getEmployeeName());
        } else {
            System.out.println("Table " + tableNumber + " is already occupied.");
        }
    }

    public void vacateTable() {
        if (isOccupied) {
            isOccupied = false;
            currentCustomer = null;
            currentOrder = null;
            assignedEmployee = null;
            System.out.println("Table " + tableNumber + " is now vacant.");
        } else {
            System.out.println("Table " + tableNumber + " is already vacant.");
        }
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }
}




