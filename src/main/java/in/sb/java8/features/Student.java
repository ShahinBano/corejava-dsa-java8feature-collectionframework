package in.sb.java8.features;

import javax.xml.namespace.QName;

public class Student {
    private int id;
    private String name;
    private int age;
    private String highestEducation;
    private String address;
    private String phonwNo;

    public Student() {
    }

    public Student(int id, String name, int age, String highestEducation, String address, String phonwNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.highestEducation = highestEducation;
        this.address = address;
        this.phonwNo = phonwNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonwNo() {
        return phonwNo;
    }

    public void setPhonwNo(String phonwNo) {
        this.phonwNo = phonwNo;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", highestEducation='" + highestEducation + '\'' +
                ", address='" + address + '\'' +
                ", phonwNo=" + phonwNo +
                '}';
    }
}
