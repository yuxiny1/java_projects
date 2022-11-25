public class Zoom {
    public static void main(String[] args) {
        // Animals bird= new Animals("bubuniao",2,32,5,"M");
        // Animals cat= new Animals("cat", 3, 2, 5,"M");
        // Animals tiger= new Animals("yaoyao", 2, 2, 3,"M");

        Bird bird1 = new Bird("fatiao", 3, 1, 2, "F");
        // bird1.fly();
        bird1.speak();
        Fish fish1 = new Fish("taotao", 1, 1, 1, "F");
        fish1.swim();
        fish1.call();
        fish1.speak();
        // bird.call();
        // bird.speak();
        // cat.call();
        // cat.speak();
        // tiger.call();
        // tiger.speak();

        Chicken chicken1 = new Chicken("chicken", 1, 1, "F");
        // method overriting, straightway
        // chicken1.fly();
        chicken1.speak();
        Sparrow sparrow1 = new Sparrow("sparrow", 1, 1, 2,"F");
        sparrow1.fly();

        Sparrow sparrow2 = new Sparrow("sparrow", 1, 1, 1, "F");
        sparrow2.move();
        sparrow2.fly();
        sparrow2.speak();
        Fish fish2 = new Fish("fish", 1, 1, 1, "F");
        fish2.move();
        fish2.swim();
        fish2.speak();

        moveAnimal(fish2);
        // moveAnimal(sparrow2);
        moveAnimal(chicken1);
    }

    public static void moveAnimal(Animals animal) {
        // genera idea of polymorphism
        animal.move();
    }
}