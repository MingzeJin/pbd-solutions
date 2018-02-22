import java.util.Scanner;
class HowOldAreYou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.nextLine();
        System.out.println("");
        
        System.out.print("Okay, " + name + ", how old are you? ");
        int age = input.nextInt();
        System.out.println("");
        
        if (age < 0 || age > 120) {
            System.out.println("You shouldn't be alive.");
        } 
        
        if (age < 6) {
            System.out.println("You shouldn't be on a computer.");
        } 
        
        if (age < 16) {
            System.out.println("You can't drive, vote, or rent a car.");
        }
        
        if (age < 18 && age >= 16) { 
            System.out.println("You can drive, but you can't vote or rent a car.");
        } 
        
        if (age < 25 && age >= 18) {
            System.out.println("You can drive and vote, but you can't rent a car.");
        } 
        
        if (age >= 25 && age <= 120) {
            System.out.println("You can do anything that's legal");
        }
    }
}
