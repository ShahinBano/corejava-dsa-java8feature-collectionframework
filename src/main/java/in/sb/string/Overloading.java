package in.sb.string;

public class Overloading {
    public static void main(String[] args) {
      Overloading ov=new Overloading();
      ov.show();
      int m=ov.show(10);
      System.out.println(m);
      main();
    }
    void show()
    {
       System.out.println("Hi Subhash");
    }
    int show(int a)
    {
        return a*2;
    }
    public static void main()
    {
        System.out.println("main overloded");
    }
}
