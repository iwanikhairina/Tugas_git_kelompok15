class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int employeeId;

    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }
}

class Costomer extends Person {
    int customerId;

    public Costomer(String name, int customerId) {
        super(name);
        this.customerId = customerId;
    }
}
