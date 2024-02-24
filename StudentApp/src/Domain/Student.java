package Domain;

/**
 * Класс описывает структуру для создания объектов типа Student
 */
public class Student extends Person implements Comparable<Student> {

    private int id;
    private static int generalId=0;

    public Student(String name, int age) {
        super(name, age);
        generalId++;
        this.id = generalId;        
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
    }


    /**
     * @apiNote Метод сравнивает вызывающий объект с объектом, переданным в качестве параметра 
     * и осуществляет сортировку по возрасту, а в случае равенства возраста – по id. 
     * @param объект типа Student.   
     * @return 0 - если объекты равны; 
     *         1 - если вызывающий объект больше объекта, переданного в качестве параметра; 
     *         -1 - если вызывающий объект меньше объекта, переданного в качестве параметра.     
     */
    @Override
    public int compareTo(Student o) {
        //System.out.println(this.getName() + " - " + o.getName());
        if (this.getAge() > o.getAge()) return 1;
        if (this.getAge() < o.getAge()) return -1;
        if (this.getId() > o.getId()) return 1;
        if (this.getId() < o.getId()) return -1;
        return 0;        
    }


    
    
    
}


