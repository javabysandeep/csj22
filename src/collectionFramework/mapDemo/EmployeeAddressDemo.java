package collectionFramework.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class EmployeeAddressDemo {
    public static void main(String[] args) {
        HashMap<Employee,Address> employeeAddressHashMap = new HashMap<>();
        Employee employee1 = new Employee(1,"abc");
        Employee employee2 = new Employee(2,"pqr");
        Employee employee3 = new Employee(3,"xyz");
        Address address1 = new Address();
        address1.setState("MH");
        Address address2 = new Address();
        address2.setState("KA");
        Address address3 = new Address();
        address3.setState("KA");

        employeeAddressHashMap.put(employee1,address1);
        employeeAddressHashMap.put(employee2,address2);
        employeeAddressHashMap.put(employee3,address3);

        for (Map.Entry<Employee,Address> emp: employeeAddressHashMap.entrySet()) {
            if(emp.getValue().getState().equals("KA")){
                System.out.println(emp);
            }
        }
    }
}
