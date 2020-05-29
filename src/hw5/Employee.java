package hw5;

public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String eMail, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.print("ФИО:" + fullName + " Должность: "
                + position + " Почта: " + eMail + " Телефон: " + phone + " Ожидаемый доход: " + salary
                + " Возраст: " + age + ".");
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        if (age < 40) {
            return;
        }
        this.age = age;
    }
}