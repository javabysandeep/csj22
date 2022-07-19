package collectionFramework.listDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee pooja = new Employee(1,"Pooja",43000);
        Employee ganu = new Employee(2,"Ganesh",2300);
        Employee anjali = new Employee(3,"Anjali",53000);
        Employee nikhil = new Employee(4,"nikhil",4300);

        employeeList.add(pooja);
        employeeList.add(ganu);
        employeeList.add(anjali);
        employeeList.add(nikhil);

        //java 7 way
        /*for (int index = 0; index < employeeList.size(); index++) {
            System.out.println(employeeList.get(index));
        }*/

        for (Employee emp:employeeList) {
            System.out.println(emp);
        }

        //java 8 way
        //employeeList.forEach(System.out::println);

        //sort integers
        List<Integer> integerList = Arrays.asList(10, 1, 34, 5);
        Collections.sort(integerList);
        System.out.println(integerList);

        //Sort employees
        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);

    }
}
