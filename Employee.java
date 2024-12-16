public class Employee {
    int id;
    String name;
    double basicPay, allowances, deductions;

    public Employee(int id, String name, double basicPay, double allowances, double deductions) {
        this.id = id;
        this.name = name;
        this.basicPay = basicPay;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    public double calculateNetSalary() {
        return basicPay + allowances - deductions;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Net Salary: " + calculateNetSalary());
    }



    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", 30000, 5000, 2000);
        emp.displayDetails();
    }
}
