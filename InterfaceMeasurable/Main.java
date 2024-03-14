public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Doe", 75000)
        };

        double averageSalary = MeasurementUtil.average(employees);
        System.out.println("Average salary: " + averageSalary);

        Employee employeeWithLargestSalary = (Employee) MeasurementUtil.largest(employees);
        System.out.println("Employee with the largest salary: " + employeeWithLargestSalary.getSalary() + ", Name: " + employeeWithLargestSalary.getName());
    }
}
