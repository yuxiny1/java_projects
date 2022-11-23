public class Earth {
    
    public static void main(String args[]){
        Human human1 = new Human("tom",25,1,"blue");
        Human human2 = new Human("sam",29,60,"green");
        Human human3 = new Human("jay",2,32,"black");

        human1.speak();
        human2.speak();
        human3.speak();

        //System.out.print(""+human1.speak()+""+"" human1.eat()"");
        //System.out.print("play"+ +" ");
        human1.eat();
        human1.work();
        human2.walk();
        human3.eat();
    }
}