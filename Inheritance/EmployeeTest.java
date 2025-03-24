// Employee class
class Employee {
    // Method to perform work
    void work() {
        System.out.println("Employee is working");
    }

    // Method to get salary
    double getSalary() {
        System.out.println("Getting salary of an employee");
        return 0.0;
    }
}

// HRManager subclass extending Employee
class HRManager extends Employee {
    // Override work method for HRManager
    @Override
    void work() {
        System.out.println("HR Manager is managing human resources");
    }

    // New method for HRManager to add an employee
    void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee();

        // Call work and getSalary methods of Employee
        System.out.println("Calling work and getSalary methods of Employee:");
        emp.work();
        double empSalary = emp.getSalary();
        System.out.println("Salary: " + empSalary);

        // Create an instance of HRManager
        HRManager hrManager = new HRManager();

        // Call work, getSalary, and addEmployee methods of HRManager
        System.out.println("\nCalling work, getSalary, and addEmployee methods of HRManager:");
        hrManager.work();
        double hrManagerSalary = hrManager.getSalary();
        System.out.println("Salary of HR Manager: " + hrManagerSalary);
        hrManager.addEmployee();
    }
}
