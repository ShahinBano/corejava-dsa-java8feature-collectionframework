package in.sb.designpattern;

import in.sb.exception.IllegalAccessException;

public class FactoryDesignPatternUsage {
    public static void main(String[] args)  {
    Juicefactory juicefactory = new Juicefactory();

    Juice juice1 = juicefactory.getJuice("apple");
    juice1.prepare();

    Juice juice2 = juicefactory.getJuice("orange");
    juice2.prepare();

    }
}
