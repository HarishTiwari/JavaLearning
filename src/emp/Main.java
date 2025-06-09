package emp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee("xyz","1",30);
        Employee emp2 = new Employee("abc","2",35);
        Employee emp3 = new Employee("uvw","3",40);

        empList.add(emp1);
    }

//
//    list.sort(Comparator.compairing(Employee::getName()))




}
