import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }
    
    public void print() {
        this.employees.stream().forEach(employee -> System.out.println(employee));
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
