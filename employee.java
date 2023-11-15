public class Employee extends Person {
    private String employeeName;

    public Employee(String employeeName, String personName) {
        super(personName);
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
