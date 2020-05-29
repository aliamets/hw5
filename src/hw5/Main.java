package hw5;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Василий Иванович", "Повар",
                "VI@mail.ru", 330503, 30000, 55);
        employee[1] = new Employee("Иван Васильевич", "Официант",
                "IV@mail.ru", 220002, 25000, 25);
        employee[2] = new Employee("Алексей Петрович", "Официант",
                "AP@mail.ru", 658742, 25000, 24);
        employee[3] = new Employee("Мария Сергеевна", "Официант",
                "MS@mail.ru", 985324, 25000, 28);
        employee[4] = new Employee("Надежда Михайловна", "Администратор",
                "NM@mail.ru", 285012, 60000, 48);
        suitableStaff(employee);
    }

    public static void suitableStaff(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > 40) {
                employee[i].info();
                System.out.println();
            }
        }
    }

}