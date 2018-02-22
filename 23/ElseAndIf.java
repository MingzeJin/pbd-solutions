// else if statements check if a condition is met only when the initial if statment condition isn't met. "else" doesn't check anything, and only runs if all prior conditions aren't met.
// removing the "else" part of an "else if" statement turns that statement into it's own indepentdent if statement.
public class ElseAndIf {
    public static void main(String[] args) {
        int people = 30;
		int cars = 40;
		int buses = 15;

		if (cars > people) {
			System.out.println("We should take the cars.");
		} else if ( cars < people ) {
			System.out.println("We should not take the cars.");
		} else {
			System.out.println("We can't decide.");
		}
        
		if (buses > cars) {
			System.out.println( "That's too many buses." );
		}  else if ( buses < cars ) {
			System.out.println( "Maybe we could take the buses." );
		} else {
			System.out.println( "We still can't decide." );
		}
        
		if ( people > buses ) {
			System.out.println( "All right, let's just take the buses." );
		} else {
			System.out.println( "Fine, let's stay home then." );
		}
    }
}
