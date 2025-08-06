package in.sb.string;

public class OverridingTest {
      Overloading show(){
        return new Overloading();
    }

    public static void main(String[] args) {
        Child c=new Child();
        Overloading o= new Overloading();
        c.show();
        o.show();
    }
}
class Child extends Overloading{
    @Override
    void show(){
       System.out.println("Hi");
    }
}
