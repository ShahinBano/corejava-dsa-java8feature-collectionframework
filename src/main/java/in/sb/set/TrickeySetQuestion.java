package in.sb.set;

import java.util.HashSet;
import java.util.Set;

public class TrickeySetQuestion {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        Employee employee1 = new Employee(1,"Shahin",26);
        Employee employee2 = new Employee(2,"Subhash",34);
        Employee employee3 = new Employee(3,"Alok",28);
        Employee employee4 = new Employee(3,"Alok",28);
        Employee employee5 = new Employee(2,"Subhash",34);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        for (Employee e : employees){
            System.out.println(e);
        }

    }
}
