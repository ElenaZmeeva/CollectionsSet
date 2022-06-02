import org.springframework.stereotype.Service;

public class EmployeeService {
   
    private final Employee[] employees;
    private int size;

    public EmployeeService() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String firstName, String lastName) {
        if (size >= employees.length) {
            System.out.println("Массив сотрудников переполнен.");
        }
        Employee newEmployee = new Employee(firstName, lastName);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String lastName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getLastName().equals(lastName)) {
                employees[i] = null;
                if (i != employees.length - 1) {
                    System.arraycopy(employees, i + 1, employees, i, size - i);
                }
                size--;
                System.out.println("Сотрудник " + lastName + "удален.");
            }
        }
    }

    public void findEmployee(String lastName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getLastName().equals(lastName)) {
                System.out.println(employee.getLastName()+ employee.getFirstName());
                return;
            }
        }
        System.out.println("Сотрудник " + lastName + " не найден.");


        Employee[] employee = new Employee[10];
        Employee ivanov = new Employee("Ivan ", "Ivanov ");
        Employee petrov = new Employee("Petr ", "Petrov ");
        Employee semenov = new Employee("Semen ", "Semenov ");
        Employee barsukov = new Employee("Stepan ", "Barsukov ");
        Employee kosatkina = new Employee("Olga ", "Kosatkina ");
        Employee komarova = new Employee("Yana ", "Komarova ");
        Employee lobanov = new Employee("Oleg ", "Lobanov ");
        Employee kirillov = new Employee("Kirill ", "Kirillov");
        Employee kolos = new Employee("Sofia ", "Kolos ");
        Employee sidorov = new Employee("Ivan ", "Sidorov ");


    }
}