package controllers;

import java.util.List;

import Domain.Person;
import Domain.WorkingPerson;

/**
 * Класс описывает структуру для создания объектов типа AccountController
 */
public class AccountController {
    public static <T extends WorkingPerson,V> void paySalary(T person, V salary){
        System.out.println(person.getName()+"выданная зарплата: "+ salary);
    }
    
    /**
     * @apiNote Метод для подсчета среднего возраста людей из списка
     * @param list лист с объектами-наследниками класса Person
     * @param <T> тип наследника класса Person
     */
    public static <T extends Person> void averageAge(List<T> list) {
        double sumOfAges = 0;
        for (T elem : list) {
            sumOfAges = sumOfAges + elem.getAge();
        }
        double averageAge = sumOfAges/ list.size();
        System.out.println("Средний возраст: "  + averageAge);
    }
}
