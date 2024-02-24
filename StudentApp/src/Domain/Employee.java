package Domain;

/**
 * Класс описывает структуру для создания объектов типа Employee
 */
public class Employee extends Person{
    private String special;

    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
