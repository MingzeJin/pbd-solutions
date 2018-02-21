import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your height in metres: ");
        double height = input.nextDouble();
        System.out.print("Your weight in kilos: ");
        double weight = input.nextDouble();
        System.out.print("");
        double BMI = weight / (height * height);
        
        System.out.println("Your BMI is " + BMI + ".");
    }
}
