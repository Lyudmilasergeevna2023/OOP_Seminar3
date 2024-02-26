package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

/**
 * Класс TeacherService описывает структуру для работы со списком преподавателей
 */
public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> listTeachers;
    
    public TeacherService() {
        this.listTeachers = new ArrayList<Teacher>();
    }


    @Override
    public List<Teacher> getAll() {
        return this.listTeachers;        
    }


    @Override
    public void create(String name, int age) {
        Teacher newTeacher = new Teacher(name, age, "преподаватель");
        this.listTeachers.add(newTeacher);
        this.count++;
    }
    
    /**
     * Метод сортировки списка преподавателей
     */
    public void sortTeachers(){
        this.listTeachers.sort(new PersonComparator<Teacher>());
    }
    
    
    /**
     * Метод вывода на консоль отсортированного списка преподавателей
     */
    public void printSortTeachers() {
        sortTeachers();
        System.out.println(this.listTeachers);
    }


    public void setTeacherList(List<Teacher> list) {
        this.listTeachers = list;
    }
}
