import java.util.Scanner;
public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, what's your name? ");
        String name = input.nextLine();
        System.out.println("");
          
        System.out.print("Hi, " + name + "! How old are you? ");
        int age = input.nextInt();
        System.out.println("");
        
        if (age >= 100) { 
            System.out.println("Did you know that in five years you'll probably be dead?");
            System.out.println("And that five years ago you were " + (age - 5) + "?");
        } else if (age <= 5) {
            System.out.println("Did you know that in five years you'll be " + (age + 5) + "?");
            System.out.println("And that five years ago you weren't born?");
        } else {
            System.out.println("Did you know that in five years you'll be " + (age + 5) + "?");
            System.out.println("And that five years ago you were " + (age - 5) + "?");
        }
    }
}
