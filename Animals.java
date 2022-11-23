public class Animals{
    String name;
    int age ;
    int height;
    int width;

    public Animals(String name, int age, int height, int width){
        super();
        this.name= name;
        this.height= height;
        this.width= width;
        this.age= age;
    }
    public void call() {
        System.out.println("wake up and eat!!!");
    }

    public void speak() {
        System.out.println("who is that guy!");
        System.out.println("my name is !"+name+ "whatsup!!!");
        System.out.println("my height is " + height + "!");
        System.out.println("my width is " + width + "!");
    }
}