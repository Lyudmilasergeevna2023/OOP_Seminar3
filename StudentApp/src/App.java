import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Employee;
import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;
import Domain.Teacher;
import Services.TeacherService;
import controllers.AccountController;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Денис", 22);
        Student s4 = new Student("Илья",  23);
        Student s5 = new Student("Дарья",  24);
        Student s6 = new Student("Елена",  23);

        Student s7 = new Student("Инна", 24);
        Student s8 = new Student("Иван", 23);
        Student s9 = new Student("Алекс", 22);
        Student s10 = new Student("Ирина",  21);
        Student s11 = new Student("Диана",  22);

        Student s12 = new Student("Елена",  23);
        Student s13 = new Student("Андрей", 24);
        Student s14 = new Student("Алексей", 23);
        Student s15 = new Student("Михаил", 22);
        

        List<Student> students1 = new ArrayList<Student>(); // Список студентов первой группы
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        students1.add(s4);
        students1.add(s5);
        students1.add(s6);
        StudentGroup studentGroup1 = new StudentGroup(students1, 4411); // Создали учебную группу 1


        //System.out.println(studentGroup1);        
        // for(Student student : studentGroup1)
        // {
        //     System.out.println(student);
        // }
        // System.out.println("=========================================================");
        // Collections.sort(studentGroup1.getGroup());
        // for(Student student: studentGroup1.getGroup())
        // {
        //     System.out.println(student);
        // }

        List<Student> students2 = new ArrayList<>(); // список студентов второй группы        
        students2.add(s7);
        students2.add(s8);
        students2.add(s9);
        students2.add(s10);
        students2.add(s11);
        StudentGroup studentGroup2 = new StudentGroup(students2, 4412); // Создали учебную группу 2

        List<Student> students3 = new ArrayList<>(); // список студентов третьей группы        
        students3.add(s12);
        students3.add(s13);
        students3.add(s14);
        students3.add(s15);
        StudentGroup studentGroup3 = new StudentGroup(students3, 4413); // Создали учебную группу 3

        List<StudentGroup> studentGroupList1 = new ArrayList<>();  // Список групп студентов для потока 1
        List<StudentGroup> studentGroupList2 = new ArrayList<>();  // Список групп студентов для потока 2

        studentGroupList1.add(studentGroup1); // Добавление группы в список групп для потока 1
        studentGroupList1.add(studentGroup2); // Добавление группы в список групп для потока 1
        studentGroupList2.add(studentGroup3); // Добавление группы в список групп для потока 2

        StudentSteam studentSteam1 = new StudentSteam(1, studentGroupList1); // Поток 1
        StudentSteam studentSteam2 = new StudentSteam(2, studentGroupList2); // Поток 2

        // Вывод групп студентов потока 1 на консоль
        System.out.println("Студенты групп потока 1:");
        for (StudentGroup studentGroup : studentSteam1) {
            System.out.println(studentGroup);
        }

        // Вывод групп студентов потока 2 на консоль
        System.out.println("Студенты групп потока 2:");
        for (StudentGroup studentGroup : studentSteam2) {
            System.out.println(studentGroup);
        }

        // Сортировка групп студентов потока 1 по количеству студентов в группе
        Collections.sort(studentSteam1.getStudentGroupList());

        // Вывод отсортированных групп студентов потока 1
        System.out.println("Отсортированный список студентов групп потока 1");       
        for (StudentGroup studentGroup : studentSteam1) {
            System.out.println(studentGroup);
        }



        System.out.println("______Seminar4______");

        Employee worker1 = new Employee("Иванов", 55, "ректор");
        Employee worker2 = new Employee("Зайцева", 40, "бухгалтер");
        Employee worker3 = new Employee("Новиков", 40, "охранник");
        List<Employee> listEmployee = new ArrayList<>(); // создаем список сотрудников
        listEmployee.add(worker1);
        listEmployee.add(worker2);
        listEmployee.add(worker3);

        Teacher teacher1 = new Teacher("Владимир Александрович", 60, "доцент");
        Teacher teacher2 = new Teacher("Сергей Николаевич", 63, "старший преподаватель");
        Teacher teacher3 = new Teacher("Михаил Александрович", 28, "ассистент");
        Teacher teacher4 = new Teacher("Валентина Алексеевна", 85, "профессор");
        List<Teacher> listTeachers = new ArrayList<>(); //создаем список преподавателей
        listTeachers.add(teacher1);
        listTeachers.add(teacher2);
        listTeachers.add(teacher3);
        listTeachers.add(teacher4);

        TeacherService teacherServiceList = new TeacherService();
        teacherServiceList.setTeacherList(listTeachers); // передаем в экземпляр TeacherService список преподавателей для сортировки
        teacherServiceList.printSortTeachers(); // выполняем сортировку и вывод на консоль списка преподавателей

        System.out.print("Преподаватели: ");
        AccountController.averageAge(listTeachers); // вывод среднего возраста преподавателей

        System.out.print("Студенты: ");
        AccountController.averageAge(students2); // вывод среднего возраста студентов

        System.out.print("Сотрудники: ");
        AccountController.averageAge(listEmployee); // вывод среднего возраста сотрудников

    }
}
 