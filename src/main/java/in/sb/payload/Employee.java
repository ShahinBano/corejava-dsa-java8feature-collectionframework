package in.sb.payload;

public class Employee {

    private Integer empNumber;
    private String empName;
    private String department;
    private Double salary;
    private String gender;
    private String location;

    public Employee(Integer empNumber, String empName, String department, Double salary, String gender, String location) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.department = department;
        this.salary=salary;
        this.gender=gender;
        this.location=location;
    }

    public Employee() {
    }

    public Integer getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double salary){
        this.salary=salary;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public String getLocation(){
        return location;
    }
     public void setLocation(String location){
        this.location=location;
     }

    @Override
    public String toString() {
        return "payload{" +
                "empNumber=" + empNumber +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary='"+ salary +'\''+
                ", gender='"+ gender +'\''+
                ", location='"+ location +'\''+
                '}';
    }
}
