import java.util.Scanner;
public class LittleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you ready to take a little quiz? (yes or no) ");
        String ready = input.nextLine();
        
        int total = 0;
        
        if (ready.equals("no")) {
            System.out.println("Aw shucks, maybe next time!");
        } else if (ready.equals("yes")) {
            System.out.println("All right, here we go!");
            System.out.println("");
            
            System.out.println("Q1) What do you call a wingless fly?");
            System.out.println("a) A flap");
            System.out.println("b) A walk");
            System.out.println("c) A plum");
            System.out.println("d) Jason");
            System.out.println("");
            
            System.out.print("> ");
            String answer1 = input.nextLine();
            
            if (answer1.equals("b")) {
                System.out.println("Correct!");
                total += 1;
            } else {
                System.out.println("Incorrect, the right answer is b)");
            }
            System.out.println("");
            
            System.out.println("Q2) Mary Rose sat on a pin.");
            System.out.println("a) O rly?");
            System.out.println("b) Burst her piles");
            System.out.println("c) AHAHAHAHAHAHAAHA");
            System.out.println("d) Mary Rose");
            System.out.println("");
            
            System.out.print("> ");
            String answer2 = input.nextLine();
            
            if (answer2.equals("d")) {
                System.out.println("Correct!");
                total += 1;
            } else {
                System.out.println("Incorrect, the right answer is d)");
            }
            System.out.println("");
            
            System.out.println("Q3) Marmite");
            System.out.println("a) Urgh!");
            System.out.println("b) What is that?");
            System.out.println("c) ... but pa might not");
            System.out.println("d) Yum");
            System.out.println("");
            
            System.out.print("> ");
            String answer3 = input.nextLine();
            
            if (answer3.equals("c")) {
                System.out.println("Correct!");
                total += 1;
            } else {
                System.out.println("Incorrect, the right answer is c)");
            }
        } else {
            System.out.println("error: invalid input");
        }
        
        System.out.println("");
        
        if (total == 0) {
            System.out.println("Congratulations, you completed the little quiz! Unfortunately you got 0/3 questions correct, you suck!");
        } else if (total == 1) {
            System.out.println("Congratulations, you completed the little quiz! Unfortunately you only got 1/3 questions correct, better luck next time!");
        } else if (total == 2) {
            System.out.println("Congratulations, you completed the little quiz! Aw, you got 2/3 questions correct, you were so close!");
        } else if (total == 3) {
            System.out.println("Congratulations, you completed the little quiz! Wow, you got 3/3 questions correct, you're a genius!");
        }
    }
}
