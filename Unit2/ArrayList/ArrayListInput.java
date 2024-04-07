import java.util.ArrayList;

class Employee {
    String name;
    int emp_id;
    double salary;

    public Employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", emp_id=" + emp_id + ", salary=" + salary + "]";
    }
}

public class ArrayListInput {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Create Employee objects and add them to the list
        Employee emp1 = new Employee("John Doe", 101, 50000.0);
        Employee emp2 = new Employee("Jane Smith", 102, 60000.0);

        employeeList.add(emp1);
        employeeList.add(emp2);

        // Print all employees in the list
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}