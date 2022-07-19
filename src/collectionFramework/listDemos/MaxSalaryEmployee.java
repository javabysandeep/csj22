package collectionFramework.listDemos;

import java.util.ArrayList;
import java.util.List;

public class MaxSalaryEmployee {
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

       //java 7 way : traditional way
        Employee highestPaidEmp = employeeList.get(0);
        for (Employee emp:employeeList) {
            if(emp.getSalary() > highestPaidEmp.getSalary()){
                highestPaidEmp = emp;
            }
        }
        System.out.println("Max salary emp: "+highestPaidEmp);
        //java 8 way
       // System.out.println("Max salary employee: "+employeeList.stream().max(Comparator.comparing(Employee::getSalary)));
    }
}
