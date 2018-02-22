public class WhatIf {
    public static void main(String[] args) {
        int people = 20;
        int cats = 20;
        int dogs = 15;
        
        if (people < cats) {
          System.out.println("Too many cats!  The world is doomed!");
        }
        
        if (people > cats) {
          System.out.println("Not many cats!  The world is saved!");
        }
        
        if (people < dogs) {
          System.out.println("The world is drooled on!");
        }
        
        if (people > dogs) {
          System.out.println("The world is dry!");
        }
        
        dogs += 5;
        
        if (people >= dogs) {
          System.out.println("People are greater than or equal to dogs.");
        }
        
        if (people <= dogs) {
          System.out.println("People are less than or equal to dogs.");
        }
        
        if (people == dogs) {
          System.out.println("People are dogs.");
        }
    }
}
// The if statement checks if the condition is true, and if it is then it will run the code inside the curly brackets
// The curly brackets contain the code that will run if the condition of the if statement is true
