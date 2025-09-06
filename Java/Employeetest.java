class Employee {
    int id;
    String name;
    double basicSalary;
     
    // Constructor
    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    // Method to calculate net salary
    double calculateNetSalary() {
        double tax;
        if(basicSalary > 50000){
            tax = basicSalary * 0.10;
        } else {
            tax = basicSalary * 0.05;
        }
        return basicSalary - tax;
    }
    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Basic Salary: " + basicSalary + ", Net Salary: " + calculateNetSalary());
    }
}
public class Employeetest {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee(1, "John", 60000);
        Employee emp2 = new Employee(2, "Jane", 45000);
        Employee emp3 = new Employee(3, "Doe", 70000);
        
        // Displaying employee details
        emp1.display();
        emp2.display();
        emp3.display();
    }
}










