import java.util.Scanner;
public class MoreInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.println("");
        
        System.out.print("First name: ");
        String firstName = input.nextLine();
        
        System.out.print("Last name: ");
        String lastName = input.nextLine();
        
        System.out.print("Grade (9-12): ");
        int grade = input.nextInt();
        
        System.out.print("Student ID: ");
        int ID = input.nextInt();
        
        System.out.print("Login: ");
        String login = input.next();
        
        System.out.print("Average: ");
        double average = input.nextDouble();
        
        System.out.println("");
        System.out.println("Your information:");
        System.out.println("Login: " + login);
        System.out.println("ID: " + ID);
        System.out.println("Name: " + firstName + ", " + lastName);
        System.out.println("Avg: " + average);
        System.out.println("Grade: " + grade);
    }
}
