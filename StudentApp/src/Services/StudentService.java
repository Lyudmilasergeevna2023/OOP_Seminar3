package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;

/**
 * Класс StudentService описывает структуру для работы со списком студентов
 */
public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> listStudents;

    public StudentService() {
        this.listStudents = new ArrayList<Student>();
    }

    @Override
    public void create(String name, int age) {
        Student newStudent = new Student(name, age);
        this.listStudents.add(newStudent);
        this.count++;        
    }

    @Override
    public List<Student> getAll() {
        return this.listStudents;
    }

    /**
     * Метод сортировки списка студентов
     */
    public void sortByFIO(){
        // PersonComparator<Student> comparator = new PersonComparator<Student>();
        // this.listStudents.sort(comparator);
        this.listStudents.sort(new PersonComparator<Student>());
    } 
    
}
