public class Zoom{
    public static void main(String[] args){
        Animals bird= new Animals("bubuniao",2,32,5);
        Animals cat= new Animals("cat", 3, 2, 5);
        Animals tiger= new Animals("yaoyao", 2, 2, 3);
        bird.call();
        bird.speak();
        cat.call();
        cat.speak();
        tiger.call();
        tiger.speak();

    }
}