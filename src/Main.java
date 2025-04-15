import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[10];

    private static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum+= employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries() / employees.length;
    }

    private static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Дмитрий Владимирович", 1, 25000);
        employees[1] = new Employee("Петров Сергей Викторович", 2, 48000);
        employees[2] = new Employee("Сазонов Игорь Петрович", 3, 98000);
        employees[3] = new Employee("Григорьев Дмитрий Васильевич", 4, 23020);
        employees[4] = new Employee("Шац Михаил Зиновьевич", 5, 54050);
        employees[5] = new Employee("Шевченко Николай Валерьевич", 1, 90070);
        employees[6] = new Employee("Чайкин Виктор Игоревич", 2, 70300);
        employees[7] = new Employee("Парамонов Олег Иванович", 3, 80000);
        employees[8] = new Employee("Николаева Снежана Денисовна", 4, 47800);
        employees[9] = new Employee("Сергеева Нина Ивановна", 5, 98500);

        print();
        System.out.println("Сумма затрат на ЗП сотрудников:" + calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП всех сотрудников: " + calculateAverageOfSalaries());
        printFullName();
    }

}