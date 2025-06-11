package pertemuan2;
import pertemuan2.Ball;

public class mainBall {
	public static void main(String[] args) {
        // Declare and initialize the necessary variables
        String color = "red";        // Initialize color variable
        int size = 10;              // Initialize size variable
        boolean moveStatus = true;  // Initialize moveStatus variable

        // Correct constructor call without semicolons
        Ball myball1 = new Ball(color, size, moveStatus); 
        
        // Print the color of the ball
        System.out.println(myball1.getColor());
    }
}	
