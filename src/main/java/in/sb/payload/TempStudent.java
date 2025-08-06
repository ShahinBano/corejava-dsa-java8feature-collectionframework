package in.sb.payload;

import java.util.List;

public class TempStudent {
    private  String name;
    private int age;
    private Address address;
    private List<MobileNumer> mobileNumers;

    public TempStudent(String name, int age, Address address, List<MobileNumer> mobileNumers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumers = mobileNumers;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumer> getMobileNumers() {
        return mobileNumers;
    }

    public void setMobileNumers(List<MobileNumer> mobileNumers) {
        this.mobileNumers = mobileNumers;
    }

    @Override
    public String toString() {
        return "TempStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobileNumers=" + mobileNumers +
                '}';
    }
}

