package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс описывает структуру для создания объектов типа StudentGroup
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return group.iterator();
    }

    @Override
    public int compareTo(StudentGroup o){
        if(this.getGroup().size()>o.getGroup().size()) return 1;
        if(this.getGroup().size()<o.getGroup().size()) return -1;
        return 0;        
    }
    
}

   
    
    

