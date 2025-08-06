package in.sb.designpattern;

public class SingletonDesingPatternUsage {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Starting Application...");
        logger2.log("Still using same logger...!");
        System.out.println(logger1==logger2);
    }
}
