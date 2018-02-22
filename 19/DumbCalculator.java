import java.util.Scanner;
public class DumbCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your first number? ");
        double firstNum = input.nextDouble();
        System.out.print("What's your second number? ");
        double secondNum = input.nextDouble();
        System.out.print("What's your third number? ");
        double thirdNum = input.nextDouble();
        System.out.println("");
        
        double ans = (firstNum + secondNum + thirdNum) / 2;
        
        System.out.println("(" + firstNum + " + " + secondNum + " + " + thirdNum + ") / 2 is... " + ans);
    }
}
