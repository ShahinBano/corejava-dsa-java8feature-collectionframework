package in.sb.polymorphism;

import java.util.*;

public class Dog implements Animal
{
void bark(){
    System.out.println("Dog is barking at stranger");
}

    public static void main(String[] args) {
        Animal a=new Dog();
//        a.sleep();
//        a.eat();
//        ((Dog) a).bark();
        Map<String,Integer>map=new HashMap<>();
        map.put("subhash",90);
        map.put("Shahin",95);
        map.put("subhash",70);
        System.out.println(map);

        Set<String>set=new HashSet<>();

        set.add(null);
        set.add("10");
        set.add(null);
        System.out.println(set);


        List<Integer>list=List.of(1,4,5,6,8);
        int[] array=new int[list.size()];
        for (int i=0;i<array.length;i++){
           array[i]=list.get(i);
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        List list1=new ArrayList();
//      Object[] listArray = list.toArray();
        for(int i=0;i< array.length;i++){
            list1.add(array[i]);
        }

}

    @Override
    public void sleep() {
        System.out.println("Animal is eating");
    }

    @Override
    public void eat() {
System.out.println("Animal is eating");
    }
}
