// Person class
class Person {
    // Properties
    private String firstName;
    private String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get the first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get the last name
    public String getLastName() {
        return lastName;
    }
}

// Employee subclass extending Person
class Employee extends Person {
    // Properties
    private String employeeId;
    private String jobTitle;

    // Constructor
    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    // Method to get the employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    // Override getLastName method to include job title
    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("John", "Doe");

        // Call getFirstName and getLastName methods of Person
        System.out.println("Person Information:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        // Create an instance of Employee
        Employee employee = new Employee("Jane", "Smith", "E123", "Software Developer");

        // Call getFirstName, getLastName, and getEmployeeId methods of Employee
        System.out.println("\nEmployee Information:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
