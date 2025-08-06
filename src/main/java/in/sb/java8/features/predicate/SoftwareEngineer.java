package in.sb.java8.features.predicate;

import java.util.function.Predicate;

public class SoftwareEngineer {
    private String name;
    private int age;
    private boolean isHavingGf;

    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHavingGf() {
        return isHavingGf;
    }
}
