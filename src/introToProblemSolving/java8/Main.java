package introToProblemSolving.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

//        Employee emp = new SoftwareEngineer();
//        System.out.println(emp.getName());
//
//        // using lambda expression
//        Employee emp1 = () -> "Software engineer lambda..";
//        System.out.println(emp1.getName());
//
//        // creating thread using lambda expression
//
//        Runnable runnable = () -> {
//           for (int i = 0 ; i < 10 ; i++){
//               System.out.println(i + " " + "Hello");
//           }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();

        // comparator example in lambda expression

//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(0);
//        list.add(10);
//        list.add(12);
//        list.add(1);
//
//        Collections.sort(list); // by default it sorts in ascending order
//        // if we need to sort in descending order we have to pass the comparator object
//        System.out.println(list.toString());
//        Collections.sort(list, (a, b) -> b - a); // here we can use lambda expression
//        // as comparator is functional interface
//        // (a,b) -> b-a
//        // int compare(a,b) { return b-a};
//        System.out.println(list.toString());


        Student Harish = new Student("Harish", 1);
        Student Sid = new Student("Sid", 2);
        Student Jerry = new Student("Jerry", 3);
        Student Rapunzel = new Student("Rapunzel", 4);
        Student Kavya = new Student("Kavya", 5);

        List<Student> list = new ArrayList<>();

        list.add(Harish);
        list.add(Sid);
        list.add(Jerry);
        list.add(Rapunzel);
        list.add(Kavya);

        Collections.sort(list, (a, b) -> b.getId() - a.getId()); // this will sort student in decreasing order by their id
        System.out.println(list.toString());

        Employee emp = () -> {
            int a= 0;
            System.out.println(a);
            return "Harish";
        };
        System.out.println(emp.getName());

        Employee softwareEngineer = new Employee() {
            @Override
            public String getName() {
                return "Test Employee";
            }
        };

        System.out.println(softwareEngineer.getName());
    }




}
