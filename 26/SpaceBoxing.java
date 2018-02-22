import java.util.Scanner;
class SpaceBoxing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your current Earth weight in kilos: ");
        double weight = input.nextDouble();
        System.out.println("");
        
        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus   2. Mars    3. Jupiter");
        System.out.println("4. Saturn  5. Uranus  6. Neptune");
        System.out.println("");
        
        System.out.print("Which planet are you choosing? ");
        int planet = input.nextInt();
        System.out.println("");
        
        if (planet == 0) {
            System.out.println("You would be dead on the Sun, but for funsies you'd weigh " + (weight * 27.96) + " pounds there.");
        } else if (planet == 1) {
            System.out.println("Your weight would be " + (weight * 0.78) + " pounds on Venus.");
        } else if (planet == 2) {
            System.out.println("Your weight would be " + (weight * 0.39) + " pounds on Mars.");
        } else if (planet == 3) {
            System.out.println("Your weight would be " + (weight * 2.65) + " pounds on Jupiter.");
        } else if (planet == 4) {
            System.out.println("Your weight would be " + (weight * 1.17) + " pounds on Saturn.");
        } else if (planet == 5) {
            System.out.println("Your weight would be " + (weight * 1.05) + " pounds on Uranus.");
        } else if (planet == 6) {
            System.out.println("Your weight would be " + (weight * 1.23) + " pounds on Neptune.");
        } else {
            System.out.println("error: please enter a valid planet.");
        }
    }
}
