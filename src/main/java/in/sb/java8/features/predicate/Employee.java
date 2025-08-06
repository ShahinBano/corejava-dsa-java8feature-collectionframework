package in.sb.java8.features.predicate;

import java.util.Objects;

public class Employee {
    private String name;
    private String designation;
    private double salary;
    private String city;

    public Employee(String name, String destination, double salary, String city) {
        this.name = name;
        this.designation = destination;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "EmployeeManagement{" +
                "name='" + name + '\'' +
                ", destination='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return Double.compare(salary, that.salary) == 0 && Objects.equals(name, that.name) && Objects.equals(designation, that.designation) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, salary, city);
    }
}
