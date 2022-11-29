public class PerformanceStage{
    // they do not have constructor 

    //private constructor for singleton
    private static PerformanceStage INSTANCE = null;
    private static int counter;
    private PerformanceStage(){
        counter++;
    }
    // instasnce , static, becasue we want it to be sort of an instance independent field. value stored in the static variable is shared by all instances of the class, only one instance of the class can be created
    
    
    public static PerformanceStage getInstance(){
        if(INSTANCE == null){
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights(){
        System.out.println("Lights on");
    }

    public int getCounter(){
        return counter;
    }
}