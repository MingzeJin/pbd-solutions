import java.util.Scanner;
public class TheForgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your favourite word?");
        input.nextLine();
        System.out.println("What's your second favourite word?");
        input.nextLine();
        System.out.println("What's your favourite number?");
        input.nextLine();
        System.out.println("What's your second favourite number?");
        input.nextLine();
        
        System.out.println("");
        System.out.println("Whew! Wasn't that fun?");
    }
}
