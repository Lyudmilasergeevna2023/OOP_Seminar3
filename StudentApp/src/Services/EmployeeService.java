package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;


/**
 * Класс EmployeeService описывает структуру для работы со списком сотрудников
 */
public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> listEmployee;
    
    public EmployeeService() {
        this.listEmployee = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return this.listEmployee;
    }


    @Override
    public void create(String name, int age) {
        Employee newEmployee = new Employee(name, age, "разнорабочий");
        this.listEmployee.add(newEmployee);
        this.count++;
    }

    
    /**
     * Метод сортировки списка сотрудников
     */
    public void sortByFIO(){
        this.listEmployee.sort(new PersonComparator<Employee>());
    }
    
    
}
