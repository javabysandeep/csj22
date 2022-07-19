package collectionFramework.listDemos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListEmployee {
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

        for (Employee employee:employeeList) {
            if (employee.getSalary()>10000){
                System.out.println(employee);
            }
        }
        List<Employee> highestPaidEmp = employeeList.stream().filter(employee -> employee.getSalary() > 10000).collect(Collectors.toList());
        System.out.println(highestPaidEmp);

        //java 8 way
        System.out.println("Max salary employee: "+employeeList.stream().max(Comparator.comparing(Employee::getSalary)));
    }
}
