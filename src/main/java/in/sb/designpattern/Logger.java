package in.sb.designpattern;

public class Logger {
    //STEP 1 :  create a private static instance of the class
    private static Logger instance;
    //private static Logger instance = new Logger();

    //STEP 2 : make the constructor private
    private Logger(){
        System.out.println("Logger Initialized");
    }

    //STEP 3 : provide public static method to get instance
    public static Logger getInstance(){
        if (instance==null){
            instance=new Logger();  //Lazy initialization
        }
        return instance;
    }

//    public static Logger getInstance(){
//        return instance; // Eager Instantiation
//    }


    public void log(String message){
        System.out.println("Log: "+message);
    }
}
