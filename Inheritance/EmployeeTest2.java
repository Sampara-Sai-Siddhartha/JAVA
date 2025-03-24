// Employee class
class Employee {
    // Properties
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;
    protected String programmingLanguage;


    // Constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus (default implementation)
    public double calculateBonus() {
        return 0.0;
    }

    // Method to generate performance report (default implementation)
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": No specific details available.");
    }

    // Method to manage projects (default implementation)
    public void manageProjects() {
        System.out.println("Employee " + name + " is not assigned to manage projects.");
    }
}

// Manager subclass extending Employee
class Manager extends Employee {
    // Additional properties for Manager
    private int teamSize;

    // Constructor
    public Manager(String name, String address, double salary, String jobTitle, int teamSize) {
        super(name, address, salary, jobTitle);
        this.teamSize = teamSize;
    }

    // Override calculateBonus method for Manager
    @Override
    public double calculateBonus() {
        // Example: Bonus for managers is 10% of salary
        return 0.1 * salary;
    }

    // Override generatePerformanceReport method for Manager
    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for Manager " + name + ": Excellent performance with a team of " + teamSize + " members.");
    }

    // Override manageProjects method for Manager
    @Override
    public void manageProjects() {
        System.out.println("Manager " + name + " is managing projects with a team of " + teamSize + " members.");
    }
}

// Developer subclass extending Employee
class Developer extends Employee {
    // Additional properties for Developer
    private String programmingLanguage;

    // Constructor
    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    // Override calculateBonus method for Developer
    @Override
    public double calculateBonus() {
        // Example: Bonus for developers is 5% of salary
        return 0.05 * salary;
    }

    // Override generatePerformanceReport method for Developer
    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for Developer " + name + ": Proficient in " + programmingLanguage + " programming.");
    }
}

// Programmer subclass extending Developer
class Programmer extends Developer {
    // Additional properties for Programmer
    private String projectType;
    private String programmingLanguage;


    // Constructor
    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String projectType) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.projectType = projectType;
    }

    // Override calculateBonus method for Programmer
    @Override
    public double calculateBonus() {
        // Example: Bonus for programmers is 7% of salary
        return 0.07 * salary;
    }

    // Override generatePerformanceReport method for Programmer
    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for Programmer " + name + ": Specialized in " + programmingLanguage +
                " programming for " + projectType + " projects.");
    }
}

public class EmployeeTest2 {
    public static void main(String[] args) {
        // Create instances of different employees
        Manager manager = new Manager("John Manager", "123 Main St", 80000, "Manager", 10);
        Developer developer = new Developer("Alice Developer", "456 Oak St", 60000, "Developer", "Java");
        Programmer programmer = new Programmer("Bob Programmer", "789 Pine St", 70000, "Programmer", "C++", "Mobile Apps");

        // Display information and perform calculations for each employee
        displayEmployeeInfo(manager);
        displayEmployeeInfo(developer);
        displayEmployeeInfo(programmer);
    }

    // Method to display information and perform calculations for an employee
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Job Title: " + employee.jobTitle);

        double bonus = employee.calculateBonus();
        System.out.println("Bonus: " + bonus);

        System.out.println("Performance Report:");
        employee.generatePerformanceReport();

        System.out.println("Project Management:");
        employee.manageProjects();

        System.out.println(); // Add a newline for better readability
    }
}
