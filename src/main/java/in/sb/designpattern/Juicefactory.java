package in.sb.designpattern;

import in.sb.exception.IllegalAccessException;

public class Juicefactory {
    public Juice getJuice(String type)  {
        if (type.equalsIgnoreCase("apple")){
            return new AppleJuice();
        } else if (type.equalsIgnoreCase("orange")) {
            return new OrangeJuice();
        }else {
            return null;
        }

    }
}
