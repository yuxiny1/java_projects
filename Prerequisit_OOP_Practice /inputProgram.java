import java.util.Scanner;

class inputProgram {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("enter your first name :");
        String firstName = input.next();

        System.out.print("enter your last name: ");
        String lastName = input.next();

        System.out.println("Your full name is " + firstName + " " + lastName);

    }
}