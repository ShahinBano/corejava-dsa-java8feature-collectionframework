package in.sb.java8.features.streamapi;


import in.sb.payload.Address;
import in.sb.payload.MobileNumer;
import in.sb.payload.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Subhash",31,new Address("848504"), Arrays.asList(new MobileNumer("7411007394"),new MobileNumer("9163458967")));
        Student student2 = new Student("Pooja",23,new Address("224121"), Arrays.asList(new MobileNumer("7411007345"),new MobileNumer("9163458990")));
        Student student3 = new Student("Basant",31,new Address("560037"), Arrays.asList(new MobileNumer("7411007301"),new MobileNumer("9163458969")));

        students = Arrays.asList(student1,student2,student3);
        // Get Student with exact match name "Subhash"

         Student name = students.stream().filter(s->s.getName().equalsIgnoreCase("Subhash")).findFirst().get();
         System.out.println(" Name "+name.getName()+"\n Address :"+name.getAddress()+"\n Mobile number :"+name.getMobileNumers()+"\n Age :"+name.getAge());

       //Get student with matching address 224121

        Student address = students.stream().filter(s->s.getAddress().getZipCode().equals("224121")).findFirst().get();
        System.out.println(" Name "+address.getName()+"\n Address :"+address.getAddress()+"\n Mobile number :"+address.getMobileNumers()+"\n Age :"+address.getAge());

        //

    }

}
