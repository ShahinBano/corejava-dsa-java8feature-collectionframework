package in.sb.designpattern;

public class BuilderPatternUsage {
    public static void main(String[] args) {
        Computer c=new Computer.Builder().setCPU("Intel i9").setRAM("256GB").setStorage("1TB SSD").build();
        System.out.println(c.toString());
    }
}
