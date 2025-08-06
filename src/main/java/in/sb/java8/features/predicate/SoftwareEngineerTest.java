package in.sb.java8.features.predicate;

import java.util.function.Predicate;

public class SoftwareEngineerTest {
    public static void main(String[] args) {
        SoftwareEngineer list[]={new SoftwareEngineer("Rahul", 25,true),new SoftwareEngineer("Alok",60,false),new SoftwareEngineer("Anis",35,true),new SoftwareEngineer("Nikhil",11,false)};
        Predicate<SoftwareEngineer> allowed = se->se.getAge()>=18 && se.isHavingGf();
        System.out.println("The allowed members into pub : ");

        for (SoftwareEngineer se : list){
            if (allowed.test(se)){
                System.out.println(se.getName());
            }
        }

    }
}
