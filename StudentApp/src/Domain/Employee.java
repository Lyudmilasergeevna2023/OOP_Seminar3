package Domain;

/**
 * Класс описывает структуру для создания объектов типа Employee
 */
public class Employee extends WorkingPerson{
    private String special;

    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }

    @Override
    public String toString() {        
        return "Employee [name=" + super.getName() + ", age=" + super.getAge() +
                ", special=" + special + "]";
    }
}
