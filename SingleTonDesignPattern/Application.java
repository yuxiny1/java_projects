public class Application {
    public static void main(String args[]) {
        // PerformanceStage stage = new PerformanceStage(); cannot visible

        PerformanceStage stage = PerformanceStage.getInstance();
        // we can only get the instance of the class by calling the getInstance method

        stage.turnOnLights();
        System.out.println(stage.getCounter());

        PerformanceStage stage2 = PerformanceStage.getInstance();

        stage2.turnOnLights();
        System.out.println(stage2.getCounter());
        // only single instance is created so counter only 1

    }
}