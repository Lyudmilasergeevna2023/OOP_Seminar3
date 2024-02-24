package Domain;

import java.util.List;
import java.util.Iterator;

/**
 * Класс описывает структуру для создания объектов типа StudentSteam
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private int steamNumber; // номер потока
    private List<StudentGroup> studentGroupList; //список групп на потоке

    
    /**
     * Конструктор для создания объекта StudentSteam
     * @param steamNumber номер потока
     * @param studentGroupList список групп студентов в потоке
     */
    public StudentSteam(int steamNumber, List<StudentGroup> studentGroupList) {
        this.steamNumber = steamNumber;
        this.studentGroupList = studentGroupList;
    }


    /**
     * Метод для получения номера потока
     * @return номер потока
     */
    public int getSteamNumber() {
        return steamNumber;
    }


    /**
     * Метод для установки номера потока
     * @param steamNumber номер потока
     */
    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }


    /**
     * Метод для получения списка групп в потоке
     * @return список групп
     */
    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }


    /**
     * Метод для установки списка групп в потоке
     * @param studentGroupList список групп
     */
    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }


    /**
     * Метод для получения строкового представления объекта StudentSteam
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "StudentSteam [steamNumber=" + steamNumber + ", studentGroupList=" + studentGroupList + "]";
    }


    /**
     * Метод получения итератора для списка групп в потоке
     * @return итератор для списка групп студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }
    
}
