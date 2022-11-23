public abstract class Animals{
    String name;
    int age ;
    int height;
    int width;
    String gender;

    public Animals(String name, int age, int height, int width, String gender){
        super();
        this.name= name;
        this.height= height;
        this.width= width;
        this.age= age;
        this.gender= gender;
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

    public void eat() {
        System.out.println("eat eat eat!!!");
    }

    public abstract void move();

    public void sleep() {
        System.out.println("sleep sleep sleep!!!");
    }

}