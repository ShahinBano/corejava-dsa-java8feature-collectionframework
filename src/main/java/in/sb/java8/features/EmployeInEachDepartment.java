package in.sb.java8.features;

import in.sb.payload.Employee;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeInEachDepartment {
    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(101,"Subhash","Development",100000.0,"male", "pune"));
        employeeList.add(new Employee(102,"Shahin","HR",20000.0,"female","blr"));
        employeeList.add(new Employee(103,"Rohan","Development",3300000.0,"male","pune"));
        employeeList.add(new Employee(104,"Rita","ITES",55000.0,"female","blr"));
        employeeList.add(new Employee(105,"Kanhya","HR",21000.0,"male","delhi "));

        displayNameOfEmployeeInEachDepartment(employeeList);
        printHighestSalary(employeeList);
        maleFemaleEmpBasedOnLocationAndDepartment(employeeList);
    }

    private static void maleFemaleEmpBasedOnLocationAndDepartment(List<Employee> employeeList) {
        System.out.println("---------------------Male Female Employee Details-------------------------");

        // Group by location
        Map<String, List<Employee>> locationMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getLocation));

        for (Map.Entry<String, List<Employee>> locationEntry : locationMap.entrySet()) {
            String location = locationEntry.getKey();
            List<Employee> employeesInLocation = locationEntry.getValue();

            System.out.println("Location: " + location);

            // Group by department within location
            Map<String, List<Employee>> departmentMap = employeesInLocation.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

            for (Map.Entry<String, List<Employee>> departmentEntry : departmentMap.entrySet()) {
                String department = departmentEntry.getKey();
                List<Employee> employeesInDept = departmentEntry.getValue();

                System.out.println("  Department: " + department);

                // Group by gender within department
                Map<String, List<Employee>> genderMap = employeesInDept.stream()
                        .collect(Collectors.groupingBy(Employee::getGender));

                for (Map.Entry<String, List<Employee>> genderEntry : genderMap.entrySet()) {
                    String gender = genderEntry.getKey();
                    List<Employee> genderList = genderEntry.getValue();

                    System.out.println("    Gender: " + gender);
                    genderList.forEach(emp -> System.out.println("      " + emp));
                }
            }
        }
    }

    private static void printHighestSalary(List<Employee> employeeList) {
        Map<String,List<Employee>>list=employeeList.stream().collect(Collectors.groupingBy(d->d.getDepartment()));
        for (Map.Entry<String,List<Employee>>entry:list.entrySet()){
            String key=entry.getKey();
            System.out.println(key+" ");
            List<Employee> empDetail=entry.getValue();
         Employee employee  = empDetail.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

         System.out.println("Name :"+employee.getEmpName()+ " Salary :"+employee.getSalary());
        }
    }

    private static void displayNameOfEmployeeInEachDepartment(List<Employee> employeeList) {

     Map<String,List<Employee>> empName= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

     for (Map.Entry<String,List<Employee>> entry:empName.entrySet()){
         String key=entry.getKey();
         System.out.print(key +" -->");
         List<Employee> name = entry.getValue();
         name.stream().forEach(employee -> {
             System.out.print(" "+employee.getEmpName()+" ");
             System.out.println();
         });
     }
    }
}
